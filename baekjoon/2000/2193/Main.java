// https://www.acmicpc.net/problem/2193
// 이친수
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
        long[] array = new long[91];
        array[1] = 1;
        array[2] = 1;
        array[3] = 2;
        for (int i = 4; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        bw.write(array[n] + "\n");
        bw.flush();
        bw.close();
    }
}