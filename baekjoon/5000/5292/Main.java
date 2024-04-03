// https://www.acmicpc.net/problem/5292
// Counting Swann’s Coins
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
        str = str.trim();
        int n = Integer.parseInt(str);
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                bw.write("DeadMan\n");
            } else if(i % 3 == 0){
                bw.write("Dead\n");
            } else if(i % 5 == 0){
                bw.write("Man\n");
            } else {
                bw.write(i + " ");
                if(i == n){
                    bw.write("\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}