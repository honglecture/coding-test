// https://www.acmicpc.net/problem/14928
// 큰 수 (BIG)
import java.io.*;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        BigInteger b1 = new BigInteger(str);
        BigInteger b2 = new BigInteger("20000303");
        bw.write(b1.mod(b2)  + "\n");
        bw.flush();
        bw.close();
    }
    
}