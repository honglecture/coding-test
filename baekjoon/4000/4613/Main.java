// https://www.acmicpc.net/problem/4613
// Quicksum
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
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    continue;
                }
                int n1 = str.charAt(i) - 64;
                int n2 = i + 1;
                int result = n1 * n2;
                sum += result;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}