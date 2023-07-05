// https://www.acmicpc.net/problem/1149
// RGB거리
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][3];
        int[][] dp = new int[size + 1][3];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
            array[i][2] = Integer.parseInt(sArray[2]);
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = Integer.min(dp[i - 1][1], dp[i - 1][2]) + array[i - 1][0];
            dp[i][1] = Integer.min(dp[i - 1][0], dp[i - 1][2]) + array[i - 1][1];
            dp[i][2] = Integer.min(dp[i - 1][0], dp[i - 1][1]) + array[i - 1][2];
        }
        int result = Integer.min(Integer.min(dp[dp.length - 1][0], dp[dp.length - 1][1]), dp[dp.length - 1][2]);
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }

    
}