// https://www.acmicpc.net/problem/9699
// RICE SACK
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            bw.write("Case #"+(i + 1)+": " + array[array.length - 1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}