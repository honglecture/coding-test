// https://www.acmicpc.net/problem/3055
// 탈출
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
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int[] goalArray = new int[2];
        int[] startArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("S")){
                    startArray[0] = i;
                    startArray[1] = j;
                } else if(array[i][j].equals("D")){
                    goalArray[0] = i;
                    goalArray[1] = j;
                }
            }
        }
        int answer = -1;
        int currentCount = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startArray[0], startArray[1], 0});
        boolean[][] visitArray = new boolean[y][x];
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentCost = pollArray[2];
            if(currentCost != currentCount){
                List<int[]> list = new ArrayList<>();
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i][j].equals("*")){
                            for (int k = 0; k < array1.length; k++) {
                                int nextY = i + array1[k];
                                int nextX = j + array2[k];
                                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                    continue;
                                }
                                if(array[nextY][nextX].equals("D")){
                                    continue;
                                }
                                if(array[nextY][nextX].equals("X")){
                                    continue;
                                }
                                list.add(new int[]{nextY, nextX});
                            }
                        }
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    array[list.get(i)[0]][list.get(i)[1]] = "*";
                }
                currentCount = currentCost;
            }
            if(array[currentY][currentX].equals("D")){
                answer = currentCost;
                break;
            }
            if(visitArray[currentY][currentX]){
                continue;
            }
            if(array[currentY][currentX].equals("X")){
                continue;
            }
            if(array[currentY][currentX].equals("*")){
                continue;
            }
            visitArray[currentY][currentX] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(visitArray[nextY][nextX]){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, currentCost + 1});
            }
        }
        if(answer == -1){
            bw.write("KAKTUS\n");
        } else {
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}