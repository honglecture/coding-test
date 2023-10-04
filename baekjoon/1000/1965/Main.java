// https://www.acmicpc.net/problem/1965
// 상자넣기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[size];
        for (int i = 0; i < dp.length - 1; i++) {
            int n1 = array[i];
            for (int j = i + 1; j < dp.length; j++) {
                int n2 = array[j];
                if(n1 < n2){
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
        bw.write(max +1 + "\n");
        bw.flush();
        bw.close();
    }
}