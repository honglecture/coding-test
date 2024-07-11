// https://www.acmicpc.net/problem/5602
// 問題1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[][] sumArray = new int[x][2];
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                int n = array[j][i];
                sum += n;
            }
            sumArray[i][0] = i + 1;
            sumArray[i][1] = sum;
        }
        Arrays.sort(sumArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < sumArray.length; i++) {
            bw.write(sumArray[i][0] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}