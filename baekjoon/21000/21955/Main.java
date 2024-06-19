// https://www.acmicpc.net/problem/21955
// Split
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int size = str.length();
        String result1 = str.substring(0, size / 2);
        String result2 = str.substring(size / 2, str.length());
        System.out.println(result1 + " " + result2);
        bw.flush();
        bw.close();
    }

}
