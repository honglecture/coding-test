// https://www.acmicpc.net/problem/2935
// 소음
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String str3 = bf.readLine();
        BigInteger b1 = new BigInteger(str1);
        BigInteger b2 = new BigInteger(str3);
        if(str2.equals("+")){
            bw.write(b1.add(b2) + "\n");
        } else {
            bw.write(b1.multiply(b2) + "\n");
        }
        bw.flush();
        bw.close();
    }
}