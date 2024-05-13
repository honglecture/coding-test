// https://www.acmicpc.net/problem/24089
// ボールの移動 (Moving Balls)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]);
            array[n1] = n2;
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
