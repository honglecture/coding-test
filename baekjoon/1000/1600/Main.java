// https://www.acmicpc.net/problem/1600
// 말이 되고픈 원숭이
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[0]);
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        int[] array3 = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] array4 = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        
        bw.flush();
        bw.close();
    }


}
