// https://www.acmicpc.net/problem/30876
// Tren del Fin del Mundo
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                return a1[1] - a2[1];
            }
        });
        System.out.println(array[0][0] + " " + array[0][1]);
        bw.flush();
        bw.close();
    }

    

}
