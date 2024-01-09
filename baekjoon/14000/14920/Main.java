// https://www.acmicpc.net/problem/14920
// 3n+1 수열
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 1;
        while (true) {
            if(n == 1){
                break;
            }
            if(n % 2 == 0){
                n = n /2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }
    
}