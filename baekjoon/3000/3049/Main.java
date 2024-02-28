// https://www.acmicpc.net/problem/3049
// 다각형의 대각선
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = n * (n - 1) * (n - 2) * (n - 3)  / 24;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}