// https://www.acmicpc.net/problem/1356
// 유진수
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
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            String str1 = str.substring(0, i + 1);
            String str2 =  str.substring(i + 1, str.length());
            long result1 = 1;
            long result2 = 1;
            for (int j = 0; j < str1.length(); j++) {
                result1 *= Integer.parseInt(str1.charAt(j) + "");
            }
            for (int j = 0; j < str2.length(); j++) {
                result2 *= Integer.parseInt(str2.charAt(j) + "");
            }
            if(result1 == result2){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

}