// https://www.acmicpc.net/problem/9507
// Generations of Tribbles
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long[] array = new long[68];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        for (int i = 4; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3] + array[i - 4];
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(array[n] + "\n");
        }
        bw.flush();
        bw.close();
    }
   

}