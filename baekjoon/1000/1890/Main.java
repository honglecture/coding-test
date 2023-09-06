// https://www.acmicpc.net/problem/1890
// 점프

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
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        long[][] dp = new long[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        dp[0][0] = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == 0){
                    continue;
                }
                int n = array[i][j];
                int nextY = n + i;
                int nextX = n + j;
                if(check(size, nextY, j)){
                    dp[nextY][j] += dp[i][j];
                }
                if(check(size, i, nextX)){
                    dp[i][nextX] += dp[i][j];
                }
            }
        }
        bw.write(dp[size - 1][size - 1] + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean check(int size, int y, int x){
        boolean result = true;
        if(y < 0 || x < 0 || y > size - 1|| x > size - 1){
            result = false;
        }
        return result;
    }
}
