// https://www.acmicpc.net/problem/1919
// 애너그램 만들기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb1 = new StringBuilder(bf.readLine());
        StringBuilder sb2 = new StringBuilder(bf.readLine());
        int sum = sb1.length() + sb2.length();
        int answer = 0;
        for (int i = 0; i < sb1.length(); i++) {
            char c1 = sb1.charAt(i);
            for (int j = 0; j < sb2.length(); j++) {
                char c2 = sb2.charAt(j);
                if(c1 == c2){
                    answer++;
                    sb2.deleteCharAt(j);
                    break;
                }
            }
        }
        int result = sum - (answer * 2);
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }

}