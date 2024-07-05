// https://www.acmicpc.net/problem/5358
// Football Team
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
            StringBuilder sb = new StringBuilder();
            if(str == null || str.equals("")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == 'e'){
                    sb.append("i");
                } else if(c == 'i'){
                    sb.append("e");
                } else if(c == 'E'){
                    sb.append("I");
                } else if(c == 'I'){
                    sb.append("E");
                } else {
                    sb.append(String.valueOf(c));
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}