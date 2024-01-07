// https://www.acmicpc.net/problem/14623
// 감정이입
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        long n1 = Long.parseLong(str1, 2);
        long n2 = Long.parseLong(str2, 2);
        long result = n1 * n2;
        String answer = Long.toString(result, 2);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}