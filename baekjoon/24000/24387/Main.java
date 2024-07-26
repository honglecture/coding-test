// https://www.acmicpc.net/problem/24387
// ИЗЛОЖЕНИЕ НА ПЧЕЛЕН МЕД
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray1[i]);
            array2[i] = Integer.parseInt(sArray2[i]);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        long answer = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            long n1 = array1[i];
            long n2 = array2[i];
            answer += n1 * n2;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
