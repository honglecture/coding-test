// https://www.acmicpc.net/problem/16395
// 파스칼의 삼각형
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[40][40];
        array[0][0] = 1;
        array[1][0] = 1;
        array[1][1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i][0] = 1;
            array[i][i] = 2;
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        System.out.println(array[y - 1][x - 1]);
        bw.flush();
        bw.close();
    }

}
