// https://www.acmicpc.net/problem/1748
// 수 이어 쓰기 1

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int n = Integer.parseInt(bf.readLine());
        String str = String.valueOf(n);
        for (int i = 1; i <= n; i++) {
            if(i >= 1 && i <= 9){
                sum += 1;
            } else if(i >= 10 && i <= 99){
                sum += 2;
            } else if(i >= 100 && i <= 999){
                sum += 3;
            } else if(i >= 1000 && i <= 9999){
                sum += 4;
            } else if(i >= 10000 && i <= 99999){
                sum += 5;
            } else if(i >= 100000 && i <= 999999){
                sum += 6;
            } else if(i >= 1000000 && i <= 9999999){
                sum += 7;
            } else if(i >= 10000000 && i <= 99999999){
                sum += 8;
            } else if(i >= 100000000){
                sum += 9;
            }
        }
        // 1 ~ 9 
        // 10 ~ 99
        // 100 ~ 999
        // 1000 ~ 9999
        // 10000 ~ 99999
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }


}
