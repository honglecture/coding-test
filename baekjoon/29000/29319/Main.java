// https://www.acmicpc.net/problem/29319
// Счастье Мистера Бина
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            sum += array[i];
        }
        Arrays.sort(array);
        sum -= array[array.length - 1];
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

    

}
