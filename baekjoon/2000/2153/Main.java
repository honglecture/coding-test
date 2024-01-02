// https://www.acmicpc.net/problem/2153
// 소수 단어
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int key = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int result = 0;
            if(c >= 65 && c <= 90){
                result = c - 65 + 27;
            } else {
                result = c - 97 + 1;
            }
            key += result;
        }
        if(isPrime(key)){
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
        bw.flush();
        bw.close();
    }
    private static boolean isPrime(int n){
        boolean result = true;;
        if(n == 0){
            return false;
        }
        if(n == 2 || n == 1){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
