// https://www.acmicpc.net/problem/24086
// 立方体 (Cube)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        System.out.println(Math.abs(n1 - n2));
        bw.flush();
        bw.close();
    }

}
