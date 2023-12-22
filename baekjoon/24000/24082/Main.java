// https://www.acmicpc.net/problem/24082
// 立方体 (Cube)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        long result = n * n * n;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
