// https://www.acmicpc.net/problem/16815
// Star in Parentheses
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '('){
                answer++;
            } else if(c == ')'){
                answer--;
            } else {
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
