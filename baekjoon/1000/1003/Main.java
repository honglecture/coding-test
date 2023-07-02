// https://www.acmicpc.net/problem/1003
// 피보나치 함수
import java.io.*;
public class Main {

    private static int count1 = 0;
    private static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] dp1 = new int[41];
        int[] dp2 = new int[41];
        dp1[1] = 0;
        dp1[2] = 1;
        dp2[1] = 1;
        dp2[2] = 1;
        for (int i = 3; i < dp1.length; i++) {
            dp1[i] = dp1[i - 2] + dp1[i - 1];
            dp2[i] = dp2[i - 2] + dp2[i - 1];
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                bw.write("1 0\n");
            } else {
                bw.write(dp1[n] + " " + dp2[n] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static int fibonacci(int n){
        if(n == 0){
            count1++;
            return 0;
        } else if(n == 1){
            count2++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}