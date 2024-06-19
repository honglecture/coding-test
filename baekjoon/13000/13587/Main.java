// https://www.acmicpc.net/problem/13587
// huaauhahhuahau
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append(String.valueOf(c));
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        bw.flush();
        bw.close();
    }

}