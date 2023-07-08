// https://www.acmicpc.net/problem/1932
// 정수 삼각형
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        dp[0][0] = array[0][0];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j == 0){
                    dp[i][j] = array[i][j] + dp[i - 1][j];
                } else if(j == i){
                    dp[i][j] = array[i][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Integer.max(array[i][j] + dp[i - 1][j - 1], array[i][j] + dp[i - 1][j]);
                }
                
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[dp.length - 1][i] > max){
                max = dp[dp.length - 1][i];
            }
        }
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}