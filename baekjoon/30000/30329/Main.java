// https://www.acmicpc.net/problem/30329
// Kick
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer = 0;
        for (int i = 1; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'i'){
                char c1 = str.charAt(i - 1);
                char c2 = str.charAt(i + 1);
                char c3 = str.charAt(i + 2);
                if(c1 == 'k' && c2 == 'c' && c3 == 'k'){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
