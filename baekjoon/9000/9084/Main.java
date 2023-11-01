// https://www.acmicpc.net/problem/9084
// 골드바흐의 추측
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size];
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int key = Integer.parseInt(bf.readLine());
            int result = getAnswer(array, key);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] array, int key){
        int count = 0;
        int[][] dp = new int[array.length][key + 1];
        dp[0][0] = 1;
        for (int i = 0; i < dp.length; i++) {
            int n = array[i];
            if(i != 0){
                for (int j = 0; j < dp[i].length; j++) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
            for (int j = 0; j < dp[i].length; j++) {
                if(j - n < 0){
                    continue;
                }
                dp[i][j] += dp[i][j - n];
            }
        }
            count = dp[dp.length - 1][key];
        return count;
    }



}