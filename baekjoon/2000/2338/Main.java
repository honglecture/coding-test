// https://www.acmicpc.net/problem/2338
// 긴자리 계산
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n1 = bf.readLine();
        String n2 = bf.readLine();
        BigDecimal b1 = new BigDecimal(n1);
        BigDecimal b2 = new BigDecimal(n2);
        bw.write(b1.add(b2) + "\n");
        bw.write(b1.subtract(b2) + "\n");
        bw.write(b1.multiply(b2) + "\n");
        bw.flush();
        bw.close();
    }
    
}