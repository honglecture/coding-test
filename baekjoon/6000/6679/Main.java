// https://www.acmicpc.net/problem/6679
// 싱기한 네자리 숫자
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1000; i <= 9999; i++) {
            String str1 = Integer.toString(i, 10);
            String str2 = Integer.toString(i, 12);
            String str3 = Integer.toString(i, 16);
            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
            for (int j = 0; j < str1.length(); j++) {
                String c1 = str1.charAt(j) + "";
                result1 += Integer.parseInt(c1);
            }
            for (int j = 0; j < str2.length(); j++) {
                String c2 = str2.charAt(j) + "";
                result2 += Integer.parseInt(c2, 12);
            }
            for (int j = 0; j < str3.length(); j++) {
                String c3 = str3.charAt(j) + "";
                result3 += Integer.parseInt(c3, 16);
            }
            if(result1 == result2 && result2 == result3){
                System.out.println(i);
            }
        }
        bw.flush();
        bw.close();
    }

    
}