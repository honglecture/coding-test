// https://www.acmicpc.net/problem/21194
// Meditation
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= array.length - k; i--) {
            sum += array[i];
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
