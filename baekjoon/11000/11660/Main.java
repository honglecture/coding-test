// https://www.acmicpc.net/problem/11660
// 구간 합 구하기 5
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[][] array = new int[size1][size1];
        int[][] dp = new int[size1 + 1][size1 + 1];
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] += -dp[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] + array[i - 1][j - 1];
            }
        }
        
        for (int i = 0; i < size2; i++) {
            int result = 0;
            sArray = bf.readLine().split(" ");
            int y1 = Integer.parseInt(sArray[0]);
            int x1 = Integer.parseInt(sArray[1]);
            int y2 = Integer.parseInt(sArray[2]);
            int x2 = Integer.parseInt(sArray[3]);
            result = dp[y1 - 1][x1 - 1] + dp[y2][x2] - dp[y1-1][x2] - dp[y2][x1 - 1];
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}