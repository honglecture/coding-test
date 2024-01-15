// https://www.acmicpc.net/problem/5692
// 팩토리얼 진법
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("0")){break;}
            long answer = 0;
            for (int i = 0; i < str.length(); i++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                answer += getAnswer(str.length() - i) * n;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static long getAnswer(int n){
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}