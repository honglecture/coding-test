// https://www.acmicpc.net/problem/2631
// 줄세우기
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
        int[] tempArray = new int[size];
        int[] array = new int[size];
        int[] dp = new int[size];
        for (int i = 0; i < tempArray.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            dp[i] = 1;
        }
        for (int i = 0; i < dp.length; i++) {
            int count = dp[i];
            int n1 = array[i];
            for (int j = i + 1; j < dp.length; j++) {
                int n2 = array[j];
                if(n1 < n2){
                    dp[j] = Integer.max(dp[j], count + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }
        bw.write(size - max + "\n");
        bw.flush();
        bw.close();
    }
}


