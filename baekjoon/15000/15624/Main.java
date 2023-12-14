// https://www.acmicpc.net/problem/15624
// 피보나치 수 7
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            int temp = num1 + num2;
            num1 = num2 % 1000000007;
            num2 = temp % 1000000007;
        }
        System.out.println(num1);
        bw.flush();
        bw.close();
    }

    
}
