// https://www.acmicpc.net/problem/9306
// Practice: Roll Call
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String s1 = bf.readLine();
            String s2 = bf.readLine();
            String answer = "Case "+(i + 1)+": "+s2+", " + s1;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}