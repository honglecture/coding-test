// https://www.acmicpc.net/problem/24075
// 計算 (Calculation)
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = {n1 - n2, n1 + n2};
        Arrays.sort(array);
        System.out.println(array[1]);
        System.out.println(array[0]);
        bw.flush();
        bw.close();
    }

}
