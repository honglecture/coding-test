// https://www.acmicpc.net/problem/26768
// H4x0r
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a'){
                sb.append("4");
            } else if(c == 'e'){
                sb.append("3");
            } else if(c == 'i'){
                sb.append("1");
            } else if(c == 'o'){
                sb.append("0");
            } else if(c == 's'){
                sb.append("5");
            } else {
                sb.append(String.valueOf(c));
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}
