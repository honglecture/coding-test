// https://www.acmicpc.net/problem/17504
// 제리와 톰 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        long result1 = 1;
        long result2 = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            long n = array[i];
            long result3 = result1 + (n * result2);
            result1 = result2;
            result2 = result3;
        }
        System.out.println((result2 - result1) + " " + result2);
        bw.flush();
        bw.close();
    }


}
