// https://www.acmicpc.net/problem/2443
// 별 찍기 - 6
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += " ";
            }
            for (int j = 0; j < (n * 2) - (2 * i) - 1; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}