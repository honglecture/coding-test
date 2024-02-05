// https://www.acmicpc.net/problem/16439
// 치킨치킨치킨
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int result = 0;
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = i + 1; j < array[0].length; j++) {
                for (int k = j + 1; k < array[0].length; k++) {
                    int index1 = i;
                    int index2 = j;
                    int index3 = k;
                    int sum = 0;
                    for (int l = 0; l < array.length; l++) {
                        int max = Integer.max(array[l][index1], Integer.max(array[l][index2], array[l][index3]));
                        sum += max;
                    }
                    if(result < sum){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    


}
