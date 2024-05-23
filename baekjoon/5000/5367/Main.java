// https://www.acmicpc.net/problem/5367
// Target Practice
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[][] array = new String[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[0][i] = "-";
            array[n - 1][i] = "-";
        }
        for (int i = 0; i < array.length; i++) {
            array[i][0] = "|";
            array[i][n - 1] = "|";
        }

        for (int i = 1; i < array.length / 2; i++) {
            array[i][i] = "*";
            array[i][n - 1 - i] = "*";
        }
        array[n / 2][n / 2] = "*";
        for (int i = array.length / 2 + 1; i < array.length - 1; i++) {
            array[i][n - 1 - i] = "*";
            array[i][i] = "*";
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}