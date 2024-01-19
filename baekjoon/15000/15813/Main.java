// https://www.acmicpc.net/problem/15813
// 너의 이름은 몇 점이니?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 64;
            answer += n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}