// https://www.acmicpc.net/problem/20350
// Account Numbers
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String subStr = str.substring(0, 4);
        StringBuilder sb = new StringBuilder(str);
        String result = "";
        sb.delete(0, 4);
        sb.append(subStr);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c >= 65 && c <= 90){
                result += (c - 55);
            } else {
                result += String.valueOf(c);
            }
        }
        BigInteger b1 = new BigInteger(result);
        BigInteger b2 = new BigInteger("97");
        BigInteger b3 = b1.mod(b2);
        if(b3.toString().equals("1")){
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
        bw.flush();
        bw.close();
    }

}
