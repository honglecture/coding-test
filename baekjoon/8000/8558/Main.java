// https://www.acmicpc.net/problem/8558
// Silnia
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            String str = result +"";
            int last = Integer.parseInt(str.charAt(str.length() - 1) + "");
            result = last;
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
   
}