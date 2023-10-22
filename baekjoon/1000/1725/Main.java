// https://www.acmicpc.net/problem/1725
// 히스토그램

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            if(max < array[i]){
                max = array[i];
            }
        }
        boolean[][] visitArray = new boolean[max][size];
        for (int i = 0; i < visitArray[0].length; i++) {
            int n = array[i];
            for (int j = visitArray.length - 1; j >= visitArray.length - n; j--) {
                visitArray[j][i] = true;
            }
        }
        
        bw.flush();
        bw.close();
    }

}
