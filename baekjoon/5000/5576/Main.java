// https://www.acmicpc.net/problem/5576
// 콘테스트
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < 10; i++) {
            array2[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int result1 = array1[9] + array1[8] + array1[7];
        int result2 = array2[9] + array2[8] + array2[7];
        bw.write(result1 + " " + result2 + "\n");

        bw.flush();
        bw.close();
    }
}