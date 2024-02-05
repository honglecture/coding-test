// https://www.acmicpc.net/problem/23804
// 골뱅이 찍기 - ㄷ
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
        for (int i = n; i < array.length - n; i++) {
            for (int j = n; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(" ")){
                    continue;
                }
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
