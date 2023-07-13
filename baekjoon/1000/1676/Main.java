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
        for (long i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
