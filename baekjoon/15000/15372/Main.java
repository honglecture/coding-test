// https://www.acmicpc.net/problem/15372
// A Simple Problem.
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            long n = Long.parseLong(bf.readLine());
            long result = n * n;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
