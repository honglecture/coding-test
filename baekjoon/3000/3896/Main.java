// https://www.acmicpc.net/problem/3896
// 소수 사이 수열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = getAnswer(n);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static int getAnswer(int k){
        int result = 0;
        if(isPirme(k)){
            return result;
        }
        result += 2;
        for (int i = k - 1; i >= 0; i--) {
            if(isPirme(i)){
                break;
            }
            result++;
        }
        for (int i = k + 1; i <= 1299709; i++) {
            if(isPirme(i)){
                break;
            }
            result++;
        }
        return result;
    }

    private static boolean isPirme(int n){
        boolean flag = true;
        if(n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    

}

