// https://www.acmicpc.net/problem/11059
// 크리 문자열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        if(sb.length() % 2 == 1){
            sb.deleteCharAt(0);
        }
        int answer = 0;
        while (true) {
            if(sb.length() == 0){
                break;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < sb.length() / 2; i++) {
                sum1 += Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            for (int i = sb.length() / 2; i < sb.length(); i++) {
                sum2 += Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            if(sum1 == sum2){
                answer = sb.length();
                break;
            }
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}