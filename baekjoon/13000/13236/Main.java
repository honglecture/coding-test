// https://www.acmicpc.net/problem/13236
// Collatz Conjecture
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str = n + " ";
        if(n == 1){
            str = "1";
        } else {
            while (true) {
                if(n == 1){
                    break;
                }
                if(n % 2 == 0){
                    n = n / 2;
                    str += n + " ";
                } else {
                    n = n * 3 + 1;
                    str += n +" ";
                }
            }
        }
        System.out.println(str);
        bw.flush();
        bw.close();
    }
}