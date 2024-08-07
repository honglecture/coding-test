// https://www.acmicpc.net/problem/5427
// 불
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            String[][] array = new String[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k];
                }
            }
            String result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String[][] array){
        int y = array.length;
        int x = array[0].length;
        String result = "IMPOSSIBLE";
        int[] array1 = {-1, 0 ,1, 0};
        int[] array2 = {0, -1, 0, 1};
        int startY = 0;
        int startX = 0;
        List<int[]> fireList = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("@")){
                    startY = i;
                    startX = j;
                } else if(array[i][j].equals("*")){
                    fireList.add(new int[]{i, j});
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < fireList.size(); i++) {
            int[] temp = fireList.get(i);
            int currentY = temp[0];
            int currentX = temp[1];
            for (int j = 0; j < array1.length; j++) {
                int nextY = currentY + array1[j];
                int nextX = currentX + array2[j];
                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, 1, 1});
            }
        }
        for (int i = 0; i < array1.length; i++) {
            int nextY = startY + array1[i];
            int nextX = startX + array2[i];
            queue.add(new int[]{nextY, nextX, 0, 1});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int type = pollArray[2];
            int count = pollArray[3];
            if(type == 0){
                if(currentY < 0 || currentX < 0 || currentY > y - 1 || currentX > x - 1){
                    answer = count;
                    break;
                }
            } else {
                if(currentY < 0 || currentX < 0 || currentY > y - 1 || currentX > x - 1){
                    continue;
                }
            }
            if(array[currentY][currentX].equals("#")){
                continue;
            }
            if(array[currentY][currentX].equals("*")){
                continue;
            }
            if(type == 0 && !array[currentY][currentX].equals(".")){
                continue;
            }
            array[currentY][currentX] = type == 0 ? "@" : "*";
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                queue.add(new int[]{nextY, nextX, type, count + 1});
            }
        }
        if(answer == 0){
            result = "IMPOSSIBLE";
        } else {
            result = String.valueOf(answer);
        }
        return result;
    }
}