// https://www.acmicpc.net/problem/3004
// 체스판 조각
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
        if(n % 2 == 0){
            answer = (n / 2 + 1) * (n / 2 + 1);
        } else {
            answer = (n / 2 + 1) * (n / 2 + 2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}