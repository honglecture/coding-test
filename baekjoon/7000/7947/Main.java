// https://www.acmicpc.net/problem/7947
// Koncert
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
            double sum1 = 0;
            double sum2 = 0;
            double sum3 = 0;
            for (int j = 0; j < 10; j++) {
                String[] sArray = bf.readLine().split(" ");
                sum1 += Integer.parseInt(sArray[0]);
                sum2 += Integer.parseInt(sArray[1]);
                sum3 += Integer.parseInt(sArray[2]);
            }
            int result1 = (int)Math.round(sum1 / 10);
            int result2 = (int)Math.round(sum2 / 10);
            int result3 = (int)Math.round(sum3 / 10);
            bw.write(result1 + " " + result2 + " " + result3 + "\n");
        }
        bw.flush();
        bw.close();
    }
}