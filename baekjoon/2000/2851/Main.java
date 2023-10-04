// https://www.acmicpc.net/problem/2851
// 슈퍼 마리오
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];
        int[] dp = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] + array[i - 1];
        }
        int count = 1;
        int n1 = 100;
        int answer = 0;
        while(true){
            for (int i = count; i < dp.length; i++) {
                int sum  = dp[i] - dp[0];
                int result = Math.abs(sum - 100);
                if(n1 > result){
                    n1 = result;
                    answer =  sum;
                } else if(n1 == result){
                    if(answer < sum){
                        answer = sum;
                    }
                }
            }
            break;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}