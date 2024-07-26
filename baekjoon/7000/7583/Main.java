// https://www.acmicpc.net/problem/7583
// Jumbled Words
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
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            String[] sArray = str.split(" ");
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < sArray.length; i++) {
                String s = sArray[i];
                if(s.length() > 2){
                    String result = String.valueOf(s.charAt(0));
                    StringBuilder sb = new StringBuilder(s.substring(1, s.length() - 1)).reverse();
                    result += sb.toString() + s.charAt(s.length() - 1);
                    answer.append(result + " ");
                } else {
                    answer.append(s + " ");
                }
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}