// https://www.acmicpc.net/problem/31907
// GIST 찍기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size * 3][size * 4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = "G";
            }
        }
        for (int i = size; i < size * 2; i++) {
            for (int j = size; j < size * 2; j++) {
                array[i][j] = "I";
            }
        }
        for (int i = size * 2; i < size * 3; i++) {
            for (int j = size * 2; j < size * 3; j++) {
                array[i][j] = "S";
            }
        }
        for (int i = size; i < size * 2; i++) {
            for (int j = size * 3; j < size * 4; j++) {
                array[i][j] = "T";
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
