// https://www.acmicpc.net/problem/2789
// 유학 금지
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        str = str.replaceAll("C", "");
        str = str.replaceAll("A", "");
        str = str.replaceAll("M", "");
        str = str.replaceAll("B", "");
        str = str.replaceAll("R", "");
        str = str.replaceAll("I", "");
        str = str.replaceAll("D", "");
        str = str.replaceAll("G", "");
        str = str.replaceAll("E", "");
        bw.write(str + "\n");
        bw.flush();
        bw.close();
    }
}