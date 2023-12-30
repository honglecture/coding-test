// https://www.acmicpc.net/problem/3943
// 헤일스톤 수열
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
            int max = 0;
            while (true) {
                if(max < n){
                    max = n;
                }
                if(n == 1){
                    break;
                }
                if(n % 2 == 0){
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}

