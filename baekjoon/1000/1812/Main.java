// https://www.acmicpc.net/problem/1812
// 사탕

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
        int[] answerArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i <= array[0]; i++) {
            int[] tempArray = new int[size];
            tempArray[0] = i;
            for (int j = 0; j < array.length - 1; j++) {
                int n1 = tempArray[j];
                int n2 = array[j];
                int n3 = Math.abs(n1 - n2);
                tempArray[j + 1] = n3;
            }
            int n1 = tempArray[tempArray.length - 1];
            int n2 = array[array.length - 1];
            if(n1 + i == n2){
                answerArray = tempArray;
                break;
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
