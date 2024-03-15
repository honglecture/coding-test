// https://www.acmicpc.net/problem/6213
// Balanced Lineup
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = n1 - 1; j <= n2 - 1; j++) {
                int n = array[j];
                if(min > n){
                    min = n;
                }
                if(max < n){
                    max = n;
                }
            }
            bw.write(max - min + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}