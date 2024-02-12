// https://www.acmicpc.net/problem/23810
// 골뱅이 찍기 - 뒤집힌 ㅋ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size * 5][size * 5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "@";
            }
        }
        for (int i = size; i < size + size; i++) {
            for (int j = size; j < array.length; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = size * 3; i < array.length; i++) {
            for (int j = size; j < array.length; j++) {
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
