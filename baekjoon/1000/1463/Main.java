// https://www.acmicpc.net/problem/1463
// 1로 만들기
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
        for (int i = dp.length - 1; i >= 1; i--) {
            int currentCount = dp[i];
            if(i % 3 == 0){
                int n1 = i / 3;
                if(dp[n1] == 0){
                    dp[n1] = currentCount + 1;
                } else if(currentCount + 1 < dp[n1]){
                    dp[n1] = currentCount + 1;
                }
            }
            if(i % 2 == 0){
                int n2 = i / 2;
                if(dp[n2] == 0){
                    dp[n2] = currentCount + 1;
                } else if(currentCount + 1 < dp[n2]){
                    dp[n2] = currentCount + 1;
                }
            }
            int n3 = i - 1;
            if(dp[n3] == 0){
                dp[n3] = currentCount + 1;
            } else if(currentCount + 1 < dp[n3]){
                dp[n3] = currentCount + 1;
            }
        }
        int count = dp[1];
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}