// https://www.acmicpc.net/problem/5565
// 영수증
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(bf.readLine());
        }
        bw.write(total - sum + "\n");
        bw.flush();
        bw.close();
    }
}