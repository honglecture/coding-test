// https://www.acmicpc.net/problem/7572
// 간지(干支)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        // 1 ~ 12 ABCDEFGHIJKL
        // 0 ~ 9
        int result1 = (n + 2012) % 12;
        int result2 = (n + 2016) % 10;
        String c = (char)(65 + result1) + "";
        bw.write(c + result2 + "\n");
        bw.flush();
        bw.close();
    }
}