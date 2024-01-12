// https://www.acmicpc.net/problem/22193
// Multiply
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        BigInteger b1 = new BigInteger(bf.readLine());
        BigInteger b2 = new BigInteger(bf.readLine());
        System.out.println(b1.multiply(b2));
        bw.flush();
        bw.close();
    }

}
