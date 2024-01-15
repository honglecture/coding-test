// https://www.acmicpc.net/problem/15633
// Fan Death
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(i == n / i){
                    answer += i;
                } else {
                    answer += i;
                    answer += n / i;
                }
                
            }
        }
        answer *= 5;
        answer -= 24;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
