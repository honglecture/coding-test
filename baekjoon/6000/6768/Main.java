// https://www.acmicpc.net/problem/6768
// Don’t pass me the ball!
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
        int answer = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int j2 = j + 1; j2 < n - 1; j2++) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}