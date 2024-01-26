// https://www.acmicpc.net/problem/14491
// 9진수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int n = Integer.parseInt(str);
        String result = Integer.toString(n, 9);
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}