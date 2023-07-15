// https://www.acmicpc.net/problem/1676
// 팩토리얼 0의 개수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long sum = 1;
        int count = 0;
        for (long i = 1; i <= n; i++) {
            sum *= i;
            while(true){
                String s = sum + "";
                if(s.charAt(s.length() - 1) == '0'){
                    sum /= 10;
                    count++;
                } else {
                    break;
                }
            }
            String s = sum + "";
            if(s.length() > 5){
                s = s.substring(s.length() - 5);
            }
            sum = Long.parseLong(s);
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }

}
