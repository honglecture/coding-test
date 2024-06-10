// https://www.acmicpc.net/problem/26731
// Zagubiona litera
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        boolean[] array = new boolean[26];
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - 65;
            array[c] = true;
        }
        for (int i = 0; i < array.length; i++) {
            if(!array[i]){
                answer = String.valueOf((char)(i + 65));
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
