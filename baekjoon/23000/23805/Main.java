// https://www.acmicpc.net/problem/23805
// 골뱅이 찍기 - 돌아간 ㄹ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[][] array = new String[n * 5][n * 5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "@";
            }
        }
        for (int i = n; i < array.length; i++) {
            for (int j = n; j < n + n; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < n * 4; i++) {
            for (int j = n * 3; j < n * 3 + n; j++) {
                array[i][j] = " ";
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
