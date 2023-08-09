// https://www.acmicpc.net/problem/1271
// 엄청난 부자2
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
        BigInteger n1 = new BigInteger(sArray[0]);
        BigInteger n2 = new BigInteger(sArray[1]);
        String result1 = n1.divide(n2).toString();
        String result2 = n1.remainder(n2).toString();
        bw.write(result1 + "\n");
        bw.write(result2 + "\n");
        bw.flush();
        bw.close();
    }
}