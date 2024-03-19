// https://www.acmicpc.net/problem/3054
// 피터팬 프레임
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int size = (str.length() * 5) - (str.length() - 1);
        int[] array1 = {-2, -1, -1, 0, 0, 1, 1, 2};
        int[] array2 = {0,-1, 1, -2, 2, -1, 1, 0};
        String[][] array = new String[5][size];
        int strIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        for (int i = 2; i < array[0].length; i += 4) {
            array[2][i] = String.valueOf(str.charAt(strIndex++));
            for (int j = 0; j < array1.length; j++) {
                int y = 2 + array1[j];
                int x = i + array2[j];
                array[y][x] = "#";
            }
        }
        for (int i = 10; i < array[0].length; i += 12) {
            for (int j = 0; j < array1.length; j++) {
                int y = 2 + array1[j];
                int x = i + array2[j];
                array[y][x] = "*";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}