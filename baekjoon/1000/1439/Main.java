// https://www.acmicpc.net/problem/1439
// 뒤집기
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
        boolean flag = false;
        char currentC = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(currentC != c){
                flag = true;
                if(c == '0'){
                    answer2++;
                } else {
                    answer1++;
                }
            }
            currentC = c;
        }
        if(flag){
            if(currentC == '0'){
                answer1++;
            } else {
                answer2++;
            }
        }
        bw.write(Integer.min(answer1, answer2) + "\n");
        bw.flush();
        bw.close();
    }
    
}