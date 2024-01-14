// https://www.acmicpc.net/problem/15904
// UCPC는 무엇의 약자일까?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if(s == 'U' || s == 'C' || s == 'P'){
                answer += s;
            }
        }
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if(count == 0){
                if(c == 'U'){
                    count++;
                }
            } else if(count == 1){
                if(c == 'C'){
                    count++;
                }
            } else if(count == 2){
                if(c == 'P'){
                    count++;
                }
            } else if(count == 3){
                if(c == 'C'){
                    count++;
                    break;
                }
            }
        }
        if(count == 4){
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
        bw.flush();
        bw.close();
    }
    
}