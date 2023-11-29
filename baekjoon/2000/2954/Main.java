// https://www.acmicpc.net/problem/2954
// 창영이의 일기장
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        str = str.replaceAll("apa", "a");
        str = str.replaceAll("epe", "e");
        str = str.replaceAll("ipi", "i");
        str = str.replaceAll("opo", "o");
        str = str.replaceAll("upu", "u");
        System.out.println(str);
        bw.flush();
        bw.close();
    }
}