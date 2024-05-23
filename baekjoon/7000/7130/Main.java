// https://www.acmicpc.net/problem/7130
// Milk and Honey
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int score1 = Integer.parseInt(sArray[0]);
        int score2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            answer += Integer.max(n1 * score1, n2 * score2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}