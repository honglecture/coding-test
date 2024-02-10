// https://www.acmicpc.net/problem/30328
// Java Warriors
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n * 4000);
        bw.flush();
        bw.close();
    }

    

}
