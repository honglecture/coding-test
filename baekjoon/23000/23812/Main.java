// https://www.acmicpc.net/problem/23812
// 골뱅이 찍기 - 돌아간 ㅍ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[][] array = new String[n * 5][n * 5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "@";
            }
        }
        for (int i = 0; i < array.length; i += (n * 2)) {
            for (int j = i; j < i + n; j++) {
                for (int k = n; k < array.length - n; k++) {
                    array[j][k] = " ";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bw.write(array[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
