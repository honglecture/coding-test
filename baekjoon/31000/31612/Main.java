// https://www.acmicpc.net/problem/31612
// 画数数え (Stroke Count)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        bf.readLine();
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'j'){
                answer += 2;
            } else if(c == 'o'){
                answer += 1;
            } else {
                answer += 2;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
