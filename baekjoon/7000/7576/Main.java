// https://www.acmicpc.net/problem/7576
// 토마토
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int x = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int[][] array = new int[y][x];
        for (int i = 0; i < y; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                array[i][j] = n;
            }
        }
        int count = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if(n == 1){
                    queue.add(new int[]{i, j});
                }
            }
        }
        
        while(true){
            Queue<int[]> nextQueue = new ArrayDeque<>();
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextY > array.length - 1){
                        continue;
                    }
                    if(nextX < 0 || nextX > array[0].length - 1){
                        continue;
                    }
                    if(array[nextY][nextX] == 1 || array[nextY][nextX] == -1){
                        continue;
                    }
                    array[nextY][nextX] = 1;
                    nextQueue.add(new int[]{nextY, nextX});
                }
            }
            if(nextQueue.size() == 0){
                break;
            }
            queue.addAll(nextQueue);
            count++;
        }
        for (int i = 0; i < array.length; i++) {
            boolean checkFlag = true;
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if(n == 0){
                    checkFlag = false;
                    count = -1;
                    break;
                }
            }
            if(!checkFlag){
                break;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}