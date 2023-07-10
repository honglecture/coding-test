// https://www.acmicpc.net/problem/2446
// 별 찍기 - 9
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int start = n * 2 - 1;
        for (int i = 0; i < n - 1; i++) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += " ";
            }
            for (int j = 0; j < start - (i * 2); j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        for (int i = n - 1; i >= 0; i--) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result += " ";
            }
            for (int j = 0; j < start - (i * 2); j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}