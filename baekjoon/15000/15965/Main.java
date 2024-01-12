// https://www.acmicpc.net/problem/15965
// K번째 소수
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    private static boolean[] primeArray = new boolean[10000001];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = true;
        }
        primeArray[0] = primeArray[1] = false;
        

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(10000000); i++) {
            if(isPrime(i)){
                for (int j = i * i; j <= 10000000; j += i) {
                    primeArray[j] = false;
                }
            }
        }
        for (int i = 0; i < primeArray.length; i++) {
            if(primeArray[i]){
                list.add(i);
            }
        }
        System.out.println(list.get(n - 1));
        bw.flush();
        bw.close();
    }


    private static boolean isPrime(int n){
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