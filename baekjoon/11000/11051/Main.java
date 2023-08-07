// https://www.acmicpc.net/problem/11051
// 이항 계수 2
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        // n1개 중 n2 개를 뽑아라
        long[][] dp = new long[1001][1001];
        int index = 1;
        for (int i = index; i < dp.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
                dp[i][j] %= 10007;
            }
        }
        bw.write(dp[n1][n2] + "\n");
        bw.flush();
        bw.close();
    }
}