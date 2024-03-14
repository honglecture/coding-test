// https://www.acmicpc.net/problem/10936
// BASE64 디코딩
import java.io.*;
import java.util.Base64;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        byte[] decodedBytes = Base64.getDecoder().decode(str);
        String decodedStr = new String(decodedBytes);
        System.out.println(decodedStr);
        bw.flush();
        bw.close();
    }


}