// https://www.acmicpc.net/problem/2225
// 합분해
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        long[][] dp = new long[n + 1][k];
        dp[0][0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                for (int l = j; l >= 0; l--) {
                    dp[i][j] += dp[i - 1][l];
                }
                dp[i][j] %= 1000000000;
            }
        }
        long sum = 0;
        for (int i = 0; i < dp[0].length; i++) {
            sum += dp[n][i];
        }
        sum %= 1000000000;
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}