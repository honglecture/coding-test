// https://www.acmicpc.net/problem/27272
// Пары
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int result = (array[0] * array[1]) + (array[2] * array[3]);
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
