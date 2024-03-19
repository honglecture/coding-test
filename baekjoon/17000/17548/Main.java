// https://www.acmicpc.net/problem/17548
// Greetings!
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'e'){
                sb.append("ee");
            } else {
                sb.append(String.valueOf(c));
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}
