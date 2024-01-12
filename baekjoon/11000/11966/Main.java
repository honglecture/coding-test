// https://www.acmicpc.net/problem/11966
// 2의 제곱인가?
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
        String str = bf.readLine();
        BigInteger b1 = new BigInteger(str);
        if(str.equals("1")){
            System.out.println("1");
        } else {
            boolean flag = true;
            while (true) {
                if(b1.toString().equals("1")){
                    break;
                }
                if(!b1.remainder(new BigInteger("2")).toString().equals("0")){
                    flag = false;
                    break;
                }
                b1 = b1.divide(new BigInteger("2"));
                if(!flag){
                    break;
                }
            }
            if(flag){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        bw.flush();
        bw.close(); 
    }

}