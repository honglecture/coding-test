// https://www.acmicpc.net/problem/5949
// Adding Commas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str =  bf.readLine();
        String answer = "";
        int count = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            answer = c + answer;
            if(count == 3){
                answer = "," + answer;
                count = 1;
            } else {
                count++;
            }
        }
        if(answer.charAt(0) == ','){
            answer = answer.substring(1, answer.length());
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}