// https://www.acmicpc.net/problem/5532
// 방학 숙제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.parseInt(bf.readLine());
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int result1 = a % c == 0 ? a / c : a / c + 1;
        int result2 = b % d == 0 ? b / d : b / d + 1;
        int answer = l - Integer.max(result1, result2);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}