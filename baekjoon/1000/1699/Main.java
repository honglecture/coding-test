// https://www.acmicpc.net/problem/1699
// 제곱수의 합
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
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = i;
            for (int j = 1; j < dp.length; j++) {
                if(i - (j * j) < 0){
                    break;
                }
                dp[i] = Integer.min(dp[i], dp[i - (j * j)] + 1);
            }
        }
        bw.write(dp[n]+"\n");
        bw.flush();
        bw.close();
    }


}
