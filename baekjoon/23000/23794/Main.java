// https://www.acmicpc.net/problem/23794
// 골뱅이 찍기 - 정사각형
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size + 2][size + 2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "@";
            }
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bw.write(array[i][j]+"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
