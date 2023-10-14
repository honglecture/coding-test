// https://www.acmicpc.net/problem/17404
// RGB거리 2
import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][3];
        int[][] dp = new int[size][3];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            array[i][0] = n1;
            array[i][1] = n2;
            array[i][2] = n3;
        }
        dp[0][0] = array[0][0];
        dp[0][1] = array[0][1];
        dp[0][2] = array[0][2];
        for (int i = 1; i < dp.length - 1; i++) {
            dp[i][0] = Integer.min(dp[i - 1][1] + array[i][0], dp[i - 1][2] + array[i][0]);
            dp[i][1] = Integer.min(dp[i - 1][0] + array[i][1], dp[i - 1][1] + array[i][1]);
            dp[i][2] = Integer.min(dp[i - 1][0] + array[i][2], dp[i - 1][1] + array[i][2]);
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i][0] + " " + dp[i][1] + " " + dp[i][2]);
        }
        //int answer = Integer.min(Integer.min(dp[dp.length - 1][0], dp[dp.length - 1][1]), dp[dp.length - 1][2]);
       // bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
