// https://www.acmicpc.net/problem/1568
// 새

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
        int count = 1;
        int answer = 0;
        while (true) {
            if(n <= 0){
                break;
            }
            answer++;
            if(n < count){
                count = 1;
                n -= count;
                count++;
            } else {
                n -= count;
                count++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
