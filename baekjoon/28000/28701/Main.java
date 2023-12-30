// https://www.acmicpc.net/problem/28701
// 세제곱의 합
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        for (int i = 1; i <= n; i++) {
            result1 += i;
            result3 += Math.pow(i, 3);
        }
        result2 = result1 * result1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        bw.flush();
        bw.close();
    }

  
}
