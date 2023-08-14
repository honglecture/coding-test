// https://www.acmicpc.net/problem/2744
// 대소문자 바꾸기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            result += c;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}