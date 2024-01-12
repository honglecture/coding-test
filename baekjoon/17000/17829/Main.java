// https://www.acmicpc.net/problem/17829
// 222-풀링
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        while (true) {
            if(size == 1){
                break;
            }
            size /= 2;
            int[][] nextArray = new int[size][size];
            for (int i = 0; i < array.length; i+=2) {
                for (int j = 0; j < array.length; j+=2) {
                    int y = i;
                    int x = j;
                    int[] innerArray = {array[y][x], array[y + 1][x], array[y][x + 1], array[y + 1][x + 1]};
                    Arrays.sort(innerArray);
                    int result = innerArray[2];
                    nextArray[y / 2][x / 2] = result;
                }
            }
            array = nextArray;
        }
        System.out.println(array[0][0]);
        bw.flush();
        bw.close();
    }

   
}