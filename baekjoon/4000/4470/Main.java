// https://www.acmicpc.net/problem/4470
// 줄번호
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
        int start = 1;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            bw.write(start + ". " + str + "\n");
            start++;
        }
        bw.flush();
        bw.close();
    }
}
