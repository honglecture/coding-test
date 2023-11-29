// https://www.acmicpc.net/problem/6131
// 완전 제곱수
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
        int answer = 0;
        for (int i = 1; i <= 1000; i++) {
            int n1 = (int) Math.pow(i, 2);
            for (int j = 1; j <= i; j++) {
                int n2 = (int) Math.pow(j, 2);
                if(n1 - n2 == n){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}