// https://www.acmicpc.net/problem/11727
// 2×n 타일링 2
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
        long[] array = new long[1001];
        array[1] = 1;
        array[2] = 3;
        array[3] = 5;
        int count = 2;
        for (int i = 4; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1] + count;
            array[i] = array[i] % 10007;
            count++;
        }
        bw.write(array[n] + "\n");
        bw.flush();
        bw.close(); 
    }
}