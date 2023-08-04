// https://www.acmicpc.net/problem/1904
// 01타일

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        int answer = 0;
        int count = 0;
        int start = 1;
        long sum = 0;
        while(true){
            sum += start;
            count++;
            if(n == sum){
                answer = count;
                break;
            } else if(n < sum){
                answer = count - 1;
                break;
            }
            start++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
