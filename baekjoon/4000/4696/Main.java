// https://www.acmicpc.net/problem/4696
// St. Ives
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
            double n = Double.parseDouble(bf.readLine());
            double result = 0;
            if(n == 0){
                break;
            }
            for (int i = 0; i < 4; i++) {
                double sum = 1;
                for (int j = 0; j <= i; j++) {
                    sum *= n;
                }
                result += sum;
            }
            result += 1;
            String answer = String.format("%.2f", result);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}