// https://www.acmicpc.net/problem/26506
// Pilot Rating
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < size / 2; i++) {
            int n1 = array[i];
            int n2 = array[size - i - 1];
            min = Integer.min(min, n1 + n2);
        }
        System.out.println(min);
        bw.flush();
        bw.close();
    }

}
