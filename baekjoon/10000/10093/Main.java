// https://www.acmicpc.net/problem/10093
// 숫자
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        BigInteger start = new BigInteger(sArray[0]);
        BigInteger end = new BigInteger(sArray[1]);
        BigInteger n = end.subtract(start);
        int size = n.intValue(); // 차이
        if(size == 0 || size == 1 || size == -1){
            bw.write("0\n");
            bw.write("\n");
            bw.flush();
            bw.close();
            return;
        } else if(size > 1){
            bw.write(size - 1 + "\n");
            for (int i = 1; i < size; i++) {
                start = start.add(new BigInteger("1"));
                bw.write(start.toString() + " ");
            }
        } else if(size < -1){
            BigInteger temp = new BigInteger(start.toString());
            start = end;
            end = temp;
            n = end.subtract(start);
            size = n.intValue();
            bw.write(size - 1 + "\n");
            for (int i = 1; i < size; i++) {
                start = start.add(new BigInteger("1"));
                bw.write(start.toString() + " ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}