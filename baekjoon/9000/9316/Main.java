// https://www.acmicpc.net/problem/9316
// Hello Judge
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= n; i++) {
            bw.write("Hello World, Judge "+i+"!\n");
        }
        bw.flush();
        bw.close();
    }
}