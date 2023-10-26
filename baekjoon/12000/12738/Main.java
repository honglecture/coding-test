// https://www.acmicpc.net/problem/12738
// 가장 긴 증가하는 부분 수열 3
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int[] dp = new int[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i];
            int count = dp[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j];
                if(n1 < n2){
                    dp[j] = Integer.max(dp[j], count + 1);
                }
            }
        }
        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i] + 1;
            }
        }
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

}
