// https://www.acmicpc.net/problem/16194
// 카드 구매하기 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n + 1];
        int[] dp = new int[n + 1];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i + 1] = Integer.parseInt(sArray[i]);
            dp[i + 1] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Integer.min(dp[i], array[j] + dp[i - j]);
            }
        }
        System.out.println(dp[n]);
        bw.flush();
        bw.close();
    }

}

