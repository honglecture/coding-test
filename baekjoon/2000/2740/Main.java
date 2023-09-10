// https://www.acmicpc.net/problem/2740
// 행렬 곱셈
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array1;
        int[][] array2;
        int size1;
        int size2;
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        size1 = y;
        array1 = new int[y][x];
        for (int j = 0; j < array1.length; j++) {
            sArray = bf.readLine().split(" ");
            for (int k = 0; k < sArray.length; k++) {
                array1[j][k] = Integer.parseInt(sArray[k]);
            }
        }
        sArray = bf.readLine().split(" ");
        y = Integer.parseInt(sArray[0]);
        x = Integer.parseInt(sArray[1]);
        size2 = x;
        array2 = new int[y][x];
        for (int j = 0; j < array2.length; j++) {
            sArray = bf.readLine().split(" ");
            for (int k = 0; k < sArray.length; k++) {
                array2[j][k] = Integer.parseInt(sArray[k]);
            }
        }
        int[][] array = new int[size1][size2];
        int indexY = 0;
        int indexX = 0;
        for (int i = 0; i < array2[0].length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array1[j].length; k++) {
                    array[indexY][indexX] += array1[j][k] * array2[k][i];
                }
                indexY++;
            }
            indexY = 0;
            indexX++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
    }

}