// https://www.acmicpc.net/problem/7595
// Triangles
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}