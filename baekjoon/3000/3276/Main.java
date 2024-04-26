// https://www.acmicpc.net/problem/3276
// ICONS
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int sum = Integer.MAX_VALUE;
        String answer = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                if(result >= n){
                    if(i + j < sum){
                        sum = i + j;
                        answer = i + " " + j;
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}