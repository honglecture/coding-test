// https://www.acmicpc.net/problem/4766
// 일반 화학 실험
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n1 = Double.parseDouble(bf.readLine());
        while (true) {
            String str = bf.readLine();
            if(str.equals("999")){
                break;
            }
            double n2 = Double.parseDouble(str);
            double result = n2 - n1;
            String answer = String.format("%.2f", result);
            bw.write(answer + "\n");
            n1 = n2;
        }
        bw.flush();
        bw.close();
    }
    
}