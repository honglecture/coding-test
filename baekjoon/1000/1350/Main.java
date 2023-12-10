// https://www.acmicpc.net/problem/1350
// 진짜 공간
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
        long[] array = new long[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Long.parseLong(sArray[i]);
        }
        int v = Integer.parseInt(bf.readLine());
        long answer = 0;
        for (int i = 0; i < array.length; i++) {
            long n = array[i];
            if(n == 0){
                continue;
            }
            if(n <= v){
                answer += v;
            } else {
                if(n % v == 0){
                    answer += (n / v) * v;
                } else {
                    answer += ((n / v) + 1) * v;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}