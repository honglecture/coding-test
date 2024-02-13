// https://www.acmicpc.net/problem/4539
// 반올림
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
            double n = Integer.parseInt(bf.readLine());
            String answer = "";
            while (true) {
                n = n / 10;
                answer = "0" + answer;
            }
        }
        bw.flush();
        bw.close();
    }

    
}