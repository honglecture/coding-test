// https://www.acmicpc.net/problem/11048
// 이동하기
import java.io.*;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[][] dp = new int[array.length][array[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        int[] array1 = {0, 1, 1};
        int[] array2 = {1, 0, 1};
        dp[0][0] = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = dp[i][j];
                for (int k = 0; k < array1.length; k++) {
                    int nextY = i + array1[k];
                    int nextX = j + array2[k];
                    if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                        continue;
                    }
                    dp[nextY][nextX] = Integer.max(dp[nextY][nextX], n + array[nextY][nextX]);
                }
            }
        }
        bw.write(dp[y - 1][x - 1] + "\n");
        bw.flush(); 
        bw.close();
    }

}