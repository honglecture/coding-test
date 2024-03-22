// https://www.acmicpc.net/problem/4593
// 중복을 없애자
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
            String str1 = bf.readLine();
            String str2 = bf.readLine();
            int answer1 = 0;
            int answer2 = 0;
            if(str1.equals("E")){
                break;
            }
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                int result = getAnswer(c1, c2);
                if(result == 1){
                    answer1++;
                } else if(result == 2) {
                    answer2++;
                }
            }
            bw.write("P1: " + answer1 + "\n");
            bw.write("P2: " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(char c1, char c2){
        int result = 0;
        if(c1 == c2){
            return result;
        }
        if(c1 == 'R'){
            if(c2 == 'S'){
                result = 1;
            } else if(c2 == 'P'){
                result = 2;
            }
        } else if(c1 == 'P'){
            if(c2 == 'S'){
                result = 2;
            } else if(c2 == 'R'){
                result = 1;
            }
        } else if(c1 == 'S'){
            if(c2 == 'R'){
                result = 2;
            } else if(c2 == 'P'){
                result = 1;
            }
        }
        return result;
    }
    
}