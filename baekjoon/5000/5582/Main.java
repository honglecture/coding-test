// https://www.acmicpc.net/problem/5582
// 공통 부분 문자열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int max = 0;
        for (int i = 1; i <= str1.length(); i++) {
            char c1 = str1.charAt(i - 1);
            for (int j = 1; j <= str2.length(); j++) {
                char c2 = str2.charAt(j - 1);
                if(c1 == c2){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Integer.max(max, dp[i][j]);
                }
            }
        }
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}