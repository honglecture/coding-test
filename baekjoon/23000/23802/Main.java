// https://www.acmicpc.net/problem/23802
// 골뱅이 찍기 - 뒤집힌 ㄱ
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
            for (int j = n; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j].equals(" ")){
                    break;
                }
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
