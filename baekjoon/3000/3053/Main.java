// https://www.acmicpc.net/problem/3053
// 택시 기하학
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
        double num1 = n * n * 3.1415926535897932;
        double num2 = n * n * 2;
        String result1 = String.format("%.6f", num1);
        String result2 = String.format("%.6f", num2);
        bw.write(result1 + "\n");
        bw.write(result2 + "\n");
        bw.flush();
        bw.close();
    }
}