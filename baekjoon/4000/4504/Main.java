// https://www.acmicpc.net/problem/4504
// 배수 찾기
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
        while (true) {
            int num = Integer.parseInt(bf.readLine());
            if(num == 0){
                break;
            }
            if(num % n == 0){
                bw.write(num + " is a multiple of " + n + ".\n");
            } else {
                bw.write(num + " is NOT a multiple of " + n + ".\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}