// https://www.acmicpc.net/problem/11899
// 괄호 끼워넣기
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
        int count = 0;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '('){
                count++;
            } else {
                count--;
            }
            if(count < 0){
                count = 0;
                answer++;
            }
        }
        System.out.println(answer + count);
        bw.flush();
        bw.close(); 
    }

}