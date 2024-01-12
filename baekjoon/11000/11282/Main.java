// https://www.acmicpc.net/problem/11282
// 한글
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 44031 +  Integer.parseInt(bf.readLine());
        System.out.println((char) n);
        bw.flush();
        bw.close();
    }

    
}