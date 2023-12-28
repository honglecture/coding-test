// https://www.acmicpc.net/problem/10179
// 쿠폰
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            double n = Double.parseDouble(bf.readLine());
            double result = n - (n * 0.2);
            String answer = String.format("%.2f", result);
            bw.write("$" + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}


