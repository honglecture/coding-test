// https://www.acmicpc.net/problem/11057
// 오르막 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long[][] dp = new long[size + 1][10];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += dp[i - 1][j] % 10007;
                dp[i][j] = sum % 10007;
            }
        }
        bw.write(dp[size][9] + "\n");
        bw.flush();
        bw.close();
    }
}