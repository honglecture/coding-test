// https://www.acmicpc.net/problem/5341
//  Pyramids
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
            int result = 0;
            for (int i = n; i >= 1; i--) {
                result += i;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}