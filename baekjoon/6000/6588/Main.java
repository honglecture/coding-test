// https://www.acmicpc.net/problem/6588
// 카잉 달력
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = getPrime();
        while(true){
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            int startNum = 3;
            while(true){
                if(array[startNum] == 0){
                    startNum++;
                    continue;
                }
                if(n - startNum <= 0){
                    bw.write("Goldbach's conjecture is wrong.\n");
                    break;
                }
                if(array[n - startNum] != 0){
                    bw.write(n + " = " + startNum + " + " + (n - startNum) + "\n");
                    break;
                } else {
                    startNum++;
                }
            }
            
        }
        bw.flush();
        bw.close();
    }

    private static int[] getPrime(){
        int n = 1000000;
        int[] prime = new int[n + 1];
        prime[0] = prime[1] = 0;
        for(int i = 2; i <=n; i++) prime[i] = i; //2부터 소수를 구하고자 하는 구간의 모든 수 나열

        for(int i = 2; i < n;i++){
            if(prime[i] == 0) continue; //소수가 아니라면 continue
            for(int j = 2*i; j <=n; j+=i) prime[j] = 0; //소수의 배수는 소수를 약수로 가지므로 제외
        }
        return prime;
    }
}