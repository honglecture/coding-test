// https://www.acmicpc.net/problem/2556
// 별 찍기 - 14
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String answer = "";
            for (int j = 0; j < n; j++) {
                answer += "*";
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}