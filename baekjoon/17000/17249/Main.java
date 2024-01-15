// https://www.acmicpc.net/problem/17249
// 태보태보 총난타
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '('){
                break;
            } else if(c == '@'){
                answer1++;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c == ')'){
                break;
            } else if(c == '@'){
                answer2++;
            }
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

}
