// https://www.acmicpc.net/problem/6974
// Long Division
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
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            BigInteger b1 = new BigInteger(bf.readLine());
            BigInteger b2 = new BigInteger(bf.readLine());
            bw.write(b1.divide(b2) + "\n");
            bw.write(b1.remainder(b2) + "\n");
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}