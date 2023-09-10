// https://www.acmicpc.net/problem/16394
// 홍익대학교
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result = n - 1946;
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
