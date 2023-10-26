// https://www.acmicpc.net/problem/5598
// 카이사르 암호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = (int) c;
            n -= 3;
            if(n < 65){
                n += 26;
            }
            sb.append(String.valueOf((char) n));
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}