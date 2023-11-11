// https://www.acmicpc.net/problem/4458
// 첫 글자를 대문자로
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
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
