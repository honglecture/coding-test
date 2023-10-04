// https://www.acmicpc.net/problem/14916
// 거스름돈
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(n % 5 == 0){
            answer = n / 5;
        } else {
            int n1 = n % 5;
            if(n1 % 2 == 0){
                answer += n / 5;
                answer += (n % 5) / 2;
            } else {
                int n2 = n % 10;
                
            }
        }
        bw.flush();
        bw.close();
    }
    
}