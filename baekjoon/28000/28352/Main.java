// https://www.acmicpc.net/problem/28352
// 안밖? 밖안? 계단? 역계단?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int n1 = 60 * 60 * 24 * 7;
        long result1 = 1;
        for (int i = n; i >= 1; i--) {
            result1 *= i;
        }
        result1 /= n1;
        System.out.println(result1);
        bw.flush();
        bw.close();
    }

  
}
