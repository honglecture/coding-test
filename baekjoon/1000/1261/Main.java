// https://www.acmicpc.net/problem/1261
// 알고스팟

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
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[0]);
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[][] dp = new int[y][x];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentCost = pollArray[2];
            if(dp[currentY][currentX] != -1 && dp[currentY][currentX] <= currentCost){
                continue;
            }
            dp[currentY][currentX] = currentCost;
            if(currentY == y - 1 && currentX == x - 1){
                continue;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                    continue;
                }
                int nextCost = array[nextY][nextX] + currentCost;
                queue.add(new int[]{nextY, nextX, nextCost});
            }
        }
        bw.write(dp[y - 1][x - 1] + "\n");
        bw.flush();
        bw.close();
    }
}