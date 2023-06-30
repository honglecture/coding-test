// https://www.acmicpc.net/problem/2441
// 별 찍기 - 4
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
            for (int j = 0; j < n - i; j++) {
                result += "*";
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}