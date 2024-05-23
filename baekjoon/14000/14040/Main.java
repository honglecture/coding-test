// https://www.acmicpc.net/problem/14040
// Hidden Palindrome
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                StringBuilder sb1 = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    sb1.append(String.valueOf(str.charAt(k)));
                }
                StringBuilder sb2 = new StringBuilder(sb1.toString()).reverse();
                if(sb1.toString().equals(sb2.toString())){
                    answer = Integer.max(answer, sb1.toString().length());
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}