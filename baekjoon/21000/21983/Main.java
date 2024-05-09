// https://www.acmicpc.net/problem/21983
// Basalt Breakdown
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        double result1 = 3.0 * Math.sqrt(3);
        double result2 = (n / result1) * 2;
        double result3 = Math.sqrt(result2) * 6;
        System.out.println(result3);
        bw.flush();
        bw.close();
    }

}
