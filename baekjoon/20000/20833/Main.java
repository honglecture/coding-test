// https://www.acmicpc.net/problem/20833
// Kuber
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int result = (int) Math.pow(i, 3);
            sum += result;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
