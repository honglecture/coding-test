// https://www.acmicpc.net/problem/2003
// 수들의 합 2
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
        int size = Integer.parseInt(sArray[0]);
        int sum = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int count = 0;
        int[] array = new int[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[size + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] + array[i - 1];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = i; j < dp.length; j++) {
                if(dp[j] - dp[i - 1] == sum){
                    count++;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}