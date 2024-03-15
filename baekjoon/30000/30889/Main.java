// https://www.acmicpc.net/problem/30889
// 좌석 배치도
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int y = str.charAt(0) - 65;
            int x = Integer.parseInt(str.substring(1)) - 1;
            array[y][x] = "o";
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
