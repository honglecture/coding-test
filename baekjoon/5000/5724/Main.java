// https://www.acmicpc.net/problem/5724
// 파인만
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
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}