// https://www.acmicpc.net/problem/23808
// 골뱅이 찍기 - ㅂ
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
        for (int i = 0; i < n * 2; i++) {
            for (int j = n; j < array.length - n; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = n * 3; i < n * 3 + n; i++) {
            for (int j = n; j < array.length - n; j++) {
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
