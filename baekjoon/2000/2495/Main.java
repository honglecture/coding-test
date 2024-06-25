// https://www.acmicpc.net/problem/2495
// 연속구간
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            String str = bf.readLine();
            int count = 1;
            int answer = 0;
            for (int j = 1; j < str.length(); j++) {
                int n1 = Integer.parseInt(String.valueOf(str.charAt(j - 1)));
                int n2 = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(n1 == n2){
                    count++;
                } else {
                    answer = Integer.max(answer, count);
                    count = 1;
                }
            }
            answer = Integer.max(answer, count);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}