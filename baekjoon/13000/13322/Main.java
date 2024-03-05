// https://www.acmicpc.net/problem/13322
// 접두사 배열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}