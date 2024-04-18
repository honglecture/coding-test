// https://www.acmicpc.net/problem/9913
// Max
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10001];
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            array[Integer.parseInt(bf.readLine())]++;
        }
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
        bw.flush();
        bw.close();
    }
}