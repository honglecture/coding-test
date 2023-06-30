// https://www.acmicpc.net/problem/2440// A+B - 2
// 별 찍기 - 3
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = size; i >= 1; i--) {
            String str = "";
            for (int j = 1; j <= i; j++) {
                str += "*";
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}