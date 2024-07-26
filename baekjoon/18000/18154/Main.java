// https://www.acmicpc.net/problem/18154
// Speeding
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 1; i < array.length; i++) {
            int n1 = array[i][0] - array[i - 1][0];
            int n2 = array[i][1] - array[i - 1][1];
            max = Integer.max(max, n2 / n1);
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }

}
