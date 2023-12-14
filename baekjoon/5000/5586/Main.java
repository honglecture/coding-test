// https://www.acmicpc.net/problem/5586
// JOI와 IOI
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String c1 = str.charAt(i) + "";
            String c2 = str.charAt(i + 1) + "";
            String c3 = str.charAt(i + 2) + "";
            String result = c1 + c2 + c3;
            if(result.equals("JOI")){
                answer1++;
            } else if(result.equals("IOI")){
                answer2++;
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
        bw.flush();
        bw.close();
    }
}