// https://www.acmicpc.net/problem/4864
// Gold Coins
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
            int answer = 0;
            int count = 0;
            int key = 1;
            for (int i = 0; i < n; i++) {
                count++;
                answer += key;
                if(key == count){
                    count = 0;
                    key++;
                }
            }
            bw.write(n + " " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}