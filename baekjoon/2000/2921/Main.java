// https://www.acmicpc.net/problem/2921
// 음계
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                answer += i + j;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}