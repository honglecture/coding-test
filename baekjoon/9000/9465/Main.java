// https://www.acmicpc.net/problem/9465
// 스티커
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int[][] array = new int[2][n];
            for (int j = 0; j < array.length; j++) {
                String[] sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = Integer.parseInt(sArray[k]);
                }
            }
            int result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[][] array){
        if(array[0].length == 1){
            return Integer.max(array[0][0], array[1][0]);
        }
        int[][] dp = new int[array[0].length][2];
        dp[0][0] = array[0][0];
        dp[0][1] = array[1][0];
        dp[1][0] = dp[0][1] + array[0][1];
        dp[1][1] = dp[0][0] + array[1][1];
        for (int i = 2; i < array[0].length; i++) {
            dp[i][0] = Integer.max(dp[i - 1][1] + array[0][i], dp[i - 2][1] + array[0][i]);
            dp[i][1] = Integer.max(dp[i - 1][0] + array[1][i], dp[i - 2][0] + array[1][i]);
        }
        return Integer.max(dp[array[0].length - 1][0], dp[array[0].length - 1][1]);
    }

}