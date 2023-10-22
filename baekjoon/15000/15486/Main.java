// https://www.acmicpc.net/problem/15486
// N과 M (5)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] dp = new int[size + 2];
        int max = 0;
        for (int i = 1; i < dp.length - 1; i++) {
            String[] sArray = bf.readLine().split(" ");
            int t = Integer.parseInt(sArray[0]);
            int m = Integer.parseInt(sArray[1]);
            if(max < dp[i]){
                max = dp[i];
            }
            if(i + t > dp.length - 1){
                continue;
            }
            dp[i + t] = Integer.max(dp[i + t], max + m);
        }
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }

    
}
