// https://www.acmicpc.net/problem/11053
// 가장 긴 증가하는 부분 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int[] dp = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            int count = dp[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j];
                if(n1 < n2){
                    if(dp[j] < count + 1){
                        dp[j] = count + 1;
                    } 
                }
            }
        }
        
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if(result < dp[i]){
                result = dp[i];
            }
        }
        result += 1;
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}