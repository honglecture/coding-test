// https://www.acmicpc.net/problem/1026
// 보물
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[n - 1 - i];
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
    
}