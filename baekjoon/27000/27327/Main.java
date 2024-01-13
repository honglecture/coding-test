// https://www.acmicpc.net/problem/27327
// 時間 (Hour)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n * 24);
        bw.flush();
        bw.close();
    }

    

}
