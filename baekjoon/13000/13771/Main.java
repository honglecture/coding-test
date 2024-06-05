// https://www.acmicpc.net/problem/13771
// Presents
import java.io.*;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Double.parseDouble(bf.readLine());
        }
        Arrays.sort(array);
        System.out.println(String.format("%.2f", array[1]));
        bw.flush();
        bw.close();
    }

}