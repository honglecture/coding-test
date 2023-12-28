// https://www.acmicpc.net/problem/26711
// A+B
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger b1 = new BigInteger(bf.readLine());
        BigInteger b2 = new BigInteger(bf.readLine());
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        bw.flush();
        bw.close();
    }

}
