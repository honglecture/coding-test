// https://www.acmicpc.net/problem/2407
// 조합
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
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        BigInteger b3 = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger temp = new BigInteger(i + "");
            b1 = b1.multiply(temp);
        }
        for (int i = 1; i <= m; i++) {
            BigInteger temp = new BigInteger(i + "");
            b2 = b2.multiply(temp);
        }
        for (int i = 1; i <= n - m; i++) {
            BigInteger temp = new BigInteger(i + "");
            b3 = b3.multiply(temp);
        }
        b2 = b2.multiply(b3);
        b1 = b1.divide(b2);
        bw.write(b1 + "\n");
        bw.flush();
        bw.close();
    }
    
}