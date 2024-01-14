// https://www.acmicpc.net/problem/8545
// Zadanie próbne
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        System.out.println(sb.reverse());
        bw.flush();
        bw.close();
    }
   
}