// https://www.acmicpc.net/problem/28648
// Торговый центр
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i] = Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[1]);
        }
        Arrays.sort(array);
        System.out.println(array[0]);
        bw.flush();
        bw.close();
    }

  
}
