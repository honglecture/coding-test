// https://www.acmicpc.net/problem/15818
// 오버플로우와 모듈러
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        long[] array = new long[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Long.parseLong(sArray[i]);
        }
        long a = array[0];
        for (int i = 1; i < array.length; i++) {
            long b = array[i];
            long result = ((a % m) * (b % m)) % m;
            a = result;
        }
        System.out.println(a % m);
        bw.flush();
        bw.close();
    }

    
}