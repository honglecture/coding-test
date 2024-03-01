// https://www.acmicpc.net/problem/25176
// 청정수열 (Easy)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
