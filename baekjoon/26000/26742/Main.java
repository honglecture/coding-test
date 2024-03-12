// https://www.acmicpc.net/problem/26742
// Skarpetki
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int result1 = 0;
        int result2 = 0;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'B'){
                result1++;
            } else {
                result2++;
            }
        }
        answer += (result1 / 2) + (result2 / 2);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
