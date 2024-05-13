// https://www.acmicpc.net/problem/21617
// Crazy Fencing
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size + 1];
        int[] array2 = new int[size];
        String[] sArray = bf.readLine().split(" ");
        double sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            double n1 = array1[i] + array1[i + 1];
            double n2 = array2[i];
            double result = (n1 * n2) / 2;
            sum += result;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
