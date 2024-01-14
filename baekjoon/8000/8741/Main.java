// https://www.acmicpc.net/problem/8741
// 이진수 합
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("1");
        }
        for (int i = 0; i < size - 1; i++) {
            sb.append("0");
        }
        bw.write(sb.toString()  + "\n");
        bw.flush();
        bw.close();
    }
   
}