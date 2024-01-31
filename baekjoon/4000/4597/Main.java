// https://www.acmicpc.net/problem/4597
// 패리티
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
            StringBuilder str = new StringBuilder(bf.readLine());
            if(str.toString().equals("#")){
                break;
            }
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '1'){
                    count++;
                }
            }
            if(str.charAt(str.length() - 1) == 'e'){ // 짝수
                if(count % 2 == 0){
                    str.setCharAt(str.length() - 1, '0');
                } else {
                    str.setCharAt(str.length() - 1, '1');
                }
            } else { // 홀수
                if(count % 2 == 0){
                    str.setCharAt(str.length() - 1, '1');
                } else {
                    str.setCharAt(str.length() - 1, '0');
                }
            }
            bw.write(str.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}