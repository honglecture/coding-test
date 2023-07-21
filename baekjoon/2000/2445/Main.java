// https://www.acmicpc.net/problem/2445
// 별 찍기 - 8
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String result = "";
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            for (int j = 0; j < (n * 2) - ((i + 1) * 2); j++) {
                result +=" ";
            }
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        for (int i = 0; i < n - 1; i++) {
            String result = "";
            for (int j = 0; j < n - i - 1; j++) {
                result += "*";
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                result +=" ";
            }
            for (int j = 0; j < n - i - 1; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}