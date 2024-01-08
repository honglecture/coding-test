// https://www.acmicpc.net/problem/14495
// 피보나치 비스무리한 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine()) - 1;
        long[] array = new long[1000];
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i < array.length; i++) {
            long n1 = array[i - 1];
            long n2 = array[i - 3];
            array[i] = n1 + n2;
        }
        System.out.println(array[key]);
        bw.flush();
        bw.close();
    }
}