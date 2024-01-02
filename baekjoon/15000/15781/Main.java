// https://www.acmicpc.net/problem/15781
// 헬멧과 조끼
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray1 = bf.readLine().split(" ");
        int[] array1 = new int[sArray1.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray1[i]);
        }
        String[] sArray2 = bf.readLine().split(" ");
        int[] array2 = new int[sArray2.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray2[i]);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int result = array1[array1.length - 1] +  array2[array2.length - 1];
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    
}