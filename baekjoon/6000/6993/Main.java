// https://www.acmicpc.net/problem/6993
// Shift Letters
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb = new StringBuilder(sArray[0]);
            int n = Integer.parseInt(sArray[1]);
            String str = sb.substring(sb.length() - n);
            sb.delete(sb.length() - n, sb.length());
            String result = str + sb.toString();
            bw.write("Shifting "+sArray[0]+" by "+n+" positions gives us: " + result + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}