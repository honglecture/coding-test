// https://www.acmicpc.net/problem/14782
// Bedtime Reading, I
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                int n1 = i;
                int n2 = n / i;
                if(n1 == n2){
                    sum += n1;
                } else {
                    sum += n1 + n2;
                }
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

    
}