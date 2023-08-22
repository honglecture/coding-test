// https://www.acmicpc.net/problem/2167
// 2차원 배열의 합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int[][] dp = new int[y + 1][x + 1];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                dp[i + 1][j + 1] = array[i][j];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] =  dp[i][j] +  dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int y1 = Integer.parseInt(sArray[0]);
            int x1 = Integer.parseInt(sArray[1]);
            int y2 = Integer.parseInt(sArray[2]);
            int x2 = Integer.parseInt(sArray[3]);
            int result = dp[y2][x2] - dp[y2][x1 - 1] - dp[y1 - 1][x2] + dp[y1 - 1][x1 - 1];
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        
    }
}