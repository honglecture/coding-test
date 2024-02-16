// https://www.acmicpc.net/problem/4539
// 반올림
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
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = getAnswer(n);
            bw.write(result + "\n");           
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n){
        int result = 0;
        String str = n + "";
        String answer = "";
        while (true) {
            if(str.length() == 1){
                break;
            }
            String s1 = str.substring(0, str.length() - 1);
            String s2 = String.valueOf(str.charAt(str.length() - 1));
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            if(n2 < 5){
                answer += "0";
            } else {
                n1 += 1;
                answer += "0";
            }
            str = n1 + "";
        }
        answer = str + answer;
        result = Integer.parseInt(answer);
        return result;
    }

    
}