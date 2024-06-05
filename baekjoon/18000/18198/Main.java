// https://www.acmicpc.net/problem/18198
// Basketball One-on-One
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = String.valueOf(str.charAt(str.length() - 2));
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
