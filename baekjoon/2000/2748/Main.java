// https://www.acmicpc.net/problem/2748
// 피보나치 수 2
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] array = new long[91];
        int n =  Integer.parseInt(bf.readLine());
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        bw.write(array[n] + "\n");
        bw.flush();
        bw.close();
    }

}