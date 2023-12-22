// https://www.acmicpc.net/problem/5893
// 17배
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
        String str = bf.readLine();
        BigInteger b1 = new BigInteger(str, 2);
        BigInteger b2 = b1.multiply(new BigInteger("17"));
        String result = b2.toString(2);
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}