// https://www.acmicpc.net/problem/2775
// 부녀회장이 될테야
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[15][15];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            if(i == 0){
                for (int j = 1; j < array.length; j++) {
                    array[i][j] = j;
                }
            } else {
                for (int j = 1; j < array.length; j++) {
                    sum += array[i - 1][j];
                    array[i][j] = sum;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            bw.write(array[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}