// https://www.acmicpc.net/problem/24078
// 余り (Remainder)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n % 21);
        bw.flush();
        bw.close();
    }

}
