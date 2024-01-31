// https://www.acmicpc.net/problem/4619
// 루트
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            double result = 0;
            int answer = 0;
            int count = 1;
            while (true) {
                double n = Math.pow(count, n2);
                if(n <= n1){
                    answer = count;
                    result = n;
                } else {
                    if(Math.abs(n1 - result) > Math.abs(n1 - n)){
                        answer = count;
                    } else {
                        answer = count - 1;
                    }
                    break;
                }
                count++;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}