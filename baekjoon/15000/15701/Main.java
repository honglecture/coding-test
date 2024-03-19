// https://www.acmicpc.net/problem/15701
// 순서쌍
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(i != n / i){
                    answer += 2;
                } else {
                    answer++;
                }
                    
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}