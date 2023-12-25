// https://www.acmicpc.net/problem/17614
// 369
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            String s = i + "";
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == '3' || c == '6' || c == '9'){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}