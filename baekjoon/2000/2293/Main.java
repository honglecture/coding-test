// https://www.acmicpc.net/problem/2293
// 동전 1
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
        int size = Integer.parseInt(sArray[0]);
        int sum = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            for (int j = n; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - n];
            }
        }
        bw.write(dp[sum] + "\n");
        bw.flush();
        bw.close();
    }
}