// https://www.acmicpc.net/problem/26529
// Bunnies
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[46];
        int size = Integer.parseInt(bf.readLine());
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            int n1 = array[i - 2];
            int n2 = array[i - 1];
            array[i] = n1 + n2;
        }
        for (int i = 0; i < size; i++) {
            int index = Integer.parseInt(bf.readLine());
            bw.write(array[index] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
