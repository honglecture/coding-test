// https://www.acmicpc.net/problem/23813
// 회전
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        int size = sb.length();
        long answer = 0;
        for (int i = 0; i < size; i++) {
            answer += Integer.parseInt(sb.toString());
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
