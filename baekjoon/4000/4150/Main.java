// https://www.acmicpc.net/problem/4150
// 피보나치 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        int size = Integer.parseInt(bf.readLine());
        for (int i = 1; i < size; i++) {
            BigInteger b3 = b1.add(b2);
            b1 = b2;
            b2 = b3;
        }
        System.out.println(b1.toString());
        bw.flush();
        bw.close();
    }
}