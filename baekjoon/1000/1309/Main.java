// https://www.acmicpc.net/problem/1309
// 동물원
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] dp = new int[100001];
        dp[1] = 3;
        dp[2] = 7;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = 2 * dp[i - 1] + dp[i - 2];
            dp[i] %= 9901;
        }
        bw.write(dp[n] + "\n");
        bw.flush();
        bw.close();
    }
}