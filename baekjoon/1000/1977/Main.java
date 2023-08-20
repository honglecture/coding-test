// https://www.acmicpc.net/problem/1977
// 완전제곱수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(bf.readLine());
        int end = Integer.parseInt(bf.readLine());
        int sum = 0;
        int min = 0;
        int n = 1;
        while(true){
            int result = n * n;
            if(result >= start && result <= end){
                if(min == 0){
                    min = result;
                }
                sum += result;
            }
            if(result > end){
                break;
            }
            n++;
        }
        if(sum == 0){
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }
        bw.flush();
        bw.close();
    }
}