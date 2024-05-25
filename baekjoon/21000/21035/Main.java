// https://www.acmicpc.net/problem/21035
// Simple Operations in Matrix
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            String type = sArray[0];
            int n1 = Integer.parseInt(sArray[1]);
            int n2 = Integer.parseInt(sArray[2]);
            if(type.equals("row")){
                for (int j = 0; j < array[0].length; j++) {
                    array[n1 - 1][j] += n2;
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[j][n1 - 1] += n2;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                min = Integer.min(min, array[i][j]);
                max = Integer.max(max, array[i][j]);
                sum += array[i][j];
            }
        }
        System.out.println(sum + " " + min + " " + max);
        bw.flush();
        bw.close();
    }

}
