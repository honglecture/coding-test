// https://www.acmicpc.net/problem/4375
// 1
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
        String s = "";
        while((s = bf.readLine()) != null && !s.isEmpty()){
            BigInteger b1 = new BigInteger(s);
            String s2 = "1";
            int count = 1;
            while(true){
                BigInteger b2 = new BigInteger(s2);
                BigInteger result = b2.mod(b1);
                if(result.toString().equals("0")){
                    break;
                }
                count++;
                s2 += "1";
            }
            bw.write(count + "\n");
            s = null;
        }
        bw.flush();
        bw.close();
    }
}
