// https://www.acmicpc.net/problem/23080
// 스키테일 암호
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i+=k) {
            answer += str.charAt(i);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
