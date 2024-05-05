// https://www.acmicpc.net/problem/11269
// Cryptographer’s Conundrum
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str.length(); i += 3) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            char c3 = str.charAt(i + 2);
            if(c1 == 'P'){
                answer += 1;
            }
            if(c2 == 'E'){
                answer += 1;
            }
            if(c3 == 'R'){
                answer += 1;
            }
        }
        bw.write((str.length() - answer) + "\n");
        bw.flush();
        bw.close();
    }

    
}