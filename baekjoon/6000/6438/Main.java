// https://www.acmicpc.net/problem/6438
// Reverse Text
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
            StringBuilder sb = new StringBuilder(bf.readLine());
            bw.write(sb.reverse() + "\n");
        }
        bw.flush();
        bw.close();
    }

}