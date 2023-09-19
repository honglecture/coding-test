// https://www.acmicpc.net/problem/15740
// A+B - 9
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        BigInteger b1 = new BigInteger(sArray[0]);
        BigInteger b2 = new BigInteger(sArray[1]);
        bw.write(b1.add(b2) + "\n");
        bw.flush();
        bw.close();
    }

    
}