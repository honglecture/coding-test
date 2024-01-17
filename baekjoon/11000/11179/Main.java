// https://www.acmicpc.net/problem/11179
// 2진수 뒤집기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String s1 = Integer.toString(n, 2);
        StringBuilder sb = new StringBuilder(s1).reverse();
        int answer = Integer.parseInt(sb.toString(), 2);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}