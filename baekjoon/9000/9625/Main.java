// https://www.acmicpc.net/problem/9625
// BABBA
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer1 = 1;
        int answer2 = 0;
        for (int i = 0; i < n; i++) {
            int next1 = answer2;
            int next2 = answer1;
            next2 += answer2;
            answer1 = next1;
            answer2 = next2;
        }
        bw.write(answer1 + "\n");
        bw.write(answer2 + "\n");
        bw.flush();
        bw.close();
    }

}