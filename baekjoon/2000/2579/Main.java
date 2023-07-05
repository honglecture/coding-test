// https://www.acmicpc.net/problem/2579
// 계단 오르기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int[] dp = new int[size + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        if(size == 1){
            bw.write(array[0]+"\n");
            bw.flush();
            bw.close();
            return;
        }
        dp[1] = array[0];
        dp[2] = array[0] + array[1];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Integer.max(dp[i - 2], dp[i - 3] + array[i - 2]) + array[i - 1];
        }
        bw.write(dp[dp.length - 1] + "\n");
        bw.flush();
        bw.close();
    }
}