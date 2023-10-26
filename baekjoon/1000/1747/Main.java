// https://www.acmicpc.net/problem/1747
// 소수&팰린드롬
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        String answer = "";
        while(true){
            long num = n;
            if(isPrime(n)){
                StringBuilder sb1 = new StringBuilder(num + "");
                StringBuilder sb2 = new StringBuilder(num + "");
                if(sb1.toString().equals(sb2.reverse().toString())){
                    answer = sb2.toString();
                    break;
                }
            }
            n++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long n){
        if(n == 1){
            return false;
        }
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }

}
