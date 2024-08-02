// https://www.acmicpc.net/problem/26550
// Ornaments
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            long sum = 0;
            long answer = 0;
            for (int j = 1; j <= n; j++) {
                sum += j;
                answer += sum;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
