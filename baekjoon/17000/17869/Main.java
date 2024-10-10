// https://www.acmicpc.net/problem/17869
// Simple Collatz Sequence
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        int answer = 0;
        while (true) {
            if(n == 1){
                break;
            }
            if(n % 2 == 0){
                n /= 2;
            } else {
                n += 1;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

   
}