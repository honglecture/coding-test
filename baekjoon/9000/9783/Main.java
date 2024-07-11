// https://www.acmicpc.net/problem/9783
// Easy Encryption
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
                answer += (c - 65 + 27);
            } else if(c >= 97 && c <= 122){
                int result = (c - 97 + 1);
                if(result < 10){
                    answer += "0" + result;
                } else {
                    answer += result;
                }
            } else if(c >= 48 && c <= 57){
                answer += "#" + String.valueOf(c);
            } else {
                answer += String.valueOf(c);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}