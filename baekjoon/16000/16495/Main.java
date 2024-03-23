// https://www.acmicpc.net/problem/16495
// 열 순서
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        long answer = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int n = c - 64;
            if(i == str.length() - 1){
                answer += n;
            } else {
                long result = (long) Math.pow(26, str.length() - 1 - i);
                answer += (result * n);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    


}
