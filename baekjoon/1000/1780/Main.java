// https://www.acmicpc.net/problem/1780
// 종이의 개수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[][] array;
    private static int[] answerArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        answerArray = new int[3];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        getAnswer(0, 0, size);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int startY, int startX, int size){
        Set<Integer> set = new HashSet<>();
        for (int i = startY; i < startY + size; i++) {
            for (int j = startX; j < startX + size; j++) {
                set.add(array[startY][startX]);
            }
        }
        if(set.size() == 1){
            int n = set.iterator().next();
            answerArray[n + 1] += (size * size);
            return;
        }

        
        

    }

}

