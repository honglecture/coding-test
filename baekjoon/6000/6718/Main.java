// https://www.acmicpc.net/problem/6718
// Goldbach’s conjecture
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 32768; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            int answer = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i; j < list.size(); j++) {
                    int sum = list.get(i) + list.get(j);
                    if(sum == n){
                        answer++;
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    
}