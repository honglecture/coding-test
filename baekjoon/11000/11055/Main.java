// https://www.acmicpc.net/problem/11055
// 가장 큰 증가하는 부분 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(array[j] < array[i]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + array[i];
        }
        
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > answer){
                answer = dp[i];
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
