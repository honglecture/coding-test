// https://www.acmicpc.net/problem/10824
// 네 수
import java.io.*;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String s1 = sArray[0];
        String s2 = sArray[1];
        String s3 = sArray[2];
        String s4 = sArray[3];
        BigInteger b1 = new BigInteger(s1 + s2);
        BigInteger b2 = new BigInteger(s3 + s4);
        bw.write(b1.add(b2) + "\n");
        bw.flush();
        bw.close();
    }

    
}