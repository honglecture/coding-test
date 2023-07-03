// https://www.acmicpc.net/problem/11726
// 2×n 타일링
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
        array[2] = 2;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
            array[i] = array[i] % 10007;
        }
        bw.write(array[n] + "\n");
        bw.flush();
        bw.close(); 
    }
}