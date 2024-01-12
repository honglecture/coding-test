// https://www.acmicpc.net/problem/10829
// 이진수 변환
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        String str = Long.toString(n, 2);
        System.out.println(str);
        bw.flush();
        bw.close();
    }


}