// https://www.acmicpc.net/problem/12015
// 가장 긴 증가하는 부분 수열 2
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[size];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    dp[j] = Integer.max(dp[j], dp[i] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }
        bw.write(max + 1 + "\n");
        bw.flush();
        bw.close();
    }
}
