// https://www.acmicpc.net/problem/13277
// 큰 수 곱셈
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        BigInteger b1 = new BigInteger(sArray[0]);
        BigInteger b2 = new BigInteger(sArray[1]);
        bw.write(b1.multiply(b2) + "\n");
        bw.flush();
        bw.close();
    }
}