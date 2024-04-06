// https://www.acmicpc.net/problem/5365
// Decoder
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        String answer = sArray[0].charAt(0) + "";
        for (int i = 1; i < sArray.length; i++) {
            String s1 = sArray[i - 1];
            String s2 = sArray[i];
            if(s1.length() > s2.length()){
                answer += " ";
            } else {
                answer += s2.charAt(s1.length() - 1);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}