// https://www.acmicpc.net/problem/5522
// 카드 게임
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(bf.readLine());
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}