// https://www.acmicpc.net/problem/4179
// 불!
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
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        int startY = 0;
        int startX = 0;
        List<int[]> fireList = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("J")){
                    startY = i;
                    startX = j;
                } else if(array[i][j].equals("F")){
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
            if(array[currentY][currentX].equals("F")){
                continue;
            }
            if(type == 0 && !array[currentY][currentX].equals(".")){
                continue;
            }
            array[currentY][currentX] = type == 0 ? "J" : "F";
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                queue.add(new int[]{nextY, nextX, type, count + 1});
            }
        }
        if(answer != 0){
            bw.write(answer + "\n");
        } else {
            bw.write("IMPOSSIBLE\n");
        }
        bw.flush();
        bw.close();
    }
}

