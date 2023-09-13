// https://www.acmicpc.net/problem/5596
// 시험 점수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < sArray2.length; i++) {
            sum1 += Integer.parseInt(sArray1[i]);
            sum2 += Integer.parseInt(sArray2[i]);
        }
        bw.write(Integer.max(sum1, sum2) + "\n");
        bw.flush();
        bw.close();
    }
}