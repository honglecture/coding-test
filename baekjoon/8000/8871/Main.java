// https://www.acmicpc.net/problem/8871
// Zadanie próbne 2
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) + 1;
        int result1 = n * 2;
        int result2 = n * 3;
        System.out.println(result1 + " " + result2);
        bw.flush();
        bw.close();
    }
   
}