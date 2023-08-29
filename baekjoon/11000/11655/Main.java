// https://www.acmicpc.net/problem/11655
// ROT13
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if(c >= 65 && c <= 90){
                c += 13;
                if(c > 90){
                    c -= 26;
                }
            } else if(c >= 97 && c <= 122){
                c += 13;
                if(c > 122){
                    c -= 26;
                }
            }
            answer += String.valueOf((char) c);
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}