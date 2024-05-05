// https://www.acmicpc.net/problem/30596
// Axis-Aligned Area
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[4];
        array[0] = Integer.parseInt(bf.readLine());
        array[1] = Integer.parseInt(bf.readLine());
        array[2] = Integer.parseInt(bf.readLine());
        array[3] = Integer.parseInt(bf.readLine());
        Arrays.sort(array);
        System.out.println(array[0] * array[2]);
        bw.flush();
        bw.close();
    }

    

}
