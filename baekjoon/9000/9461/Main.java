// https://www.acmicpc.net/problem/9461
// 파도반 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long[] array = new long[101];
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 2;
        array[5] = 2;
        array[6] = 3;
        array[7] = 4;
        array[8] = 5;
        for (int i = 9; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 5];
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(array[n] + "\n");
        }
        bw.flush();
        bw.close();
    }

}