// https://www.acmicpc.net/problem/13073
// Sums
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;
            int start1 = 1;
            int start2 = 2;
            for (int j = 1; j <= n; j++) {
                sum1 += j;
                sum2 += start1;
                sum3 += start2;
                start1 += 2;
                start2 += 2;
            }
            bw.write(sum1 + " " + sum2 + " " + sum3 + "\n");
        }
        bw.flush();
        bw.close();
    }
}