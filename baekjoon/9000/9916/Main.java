// https://www.acmicpc.net/problem/9916
// Zeros
import java.io.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        BigDecimal b1 = new BigDecimal(1);
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            BigDecimal b2 = b1.multiply(new BigDecimal(i));
            b1 = b2;
        }
        String str = b1.toString();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0'){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}