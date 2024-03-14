// https://www.acmicpc.net/problem/10935
// SHA-384
import java.io.*;
import java.util.Base64;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String encodedStr = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedStr);
        bw.flush();
        bw.close();
    }


}