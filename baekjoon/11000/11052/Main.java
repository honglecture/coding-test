// https://www.acmicpc.net/problem/11052
// 카드 구매하기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        int[] dp = new int[n + 1];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            dp[i + 1] = array[i];
        }
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j <= i / 2; j++) {
                int sum = dp[j] + dp[i - j];
                dp[i] = Integer.max(dp[i], sum);
            }
        }
        bw.write(dp[n] + "\n");
        bw.flush();
        bw.close();
    }
}