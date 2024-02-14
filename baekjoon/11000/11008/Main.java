// https://www.acmicpc.net/problem/11008
// 복붙의 달인
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            String result = s1.replaceAll(s2, "");
            int n = (s1.length() - result.length()) / s2.length();
            int answer = result.length() + n;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}