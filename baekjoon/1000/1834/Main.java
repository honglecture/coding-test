// https://www.acmicpc.net/problem/1834
// 나머지와 몫이 같은 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long sum = 0;
        long count = 1;
        while (true) {
            long result = (n * count) + count;
            if(result % n == 0){
                break;
            }
            sum += result;
            count++;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
}
