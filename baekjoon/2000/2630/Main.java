// https://www.acmicpc.net/problem/2630
// 색종이 만들기
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
        Set<Integer> set = new HashSet<>();
        answerArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                set.add(array[i][j]);
            }
        }
        getAnswer(0, 0, size);
        bw.write(answerArray[0] + "\n");
        bw.write(answerArray[1] + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int startY, int startX, int size){
        Set<Integer> set = new HashSet<>();
        for (int i = startY; i < startY + size; i++) {
            for (int j = startX; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            answerArray[set.iterator().next()]++;
            return;
        }
        set.clear();
        for (int i = startY; i < startY + size / 2; i++) {
            for (int j = startX; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            answerArray[set.iterator().next()]++;
        } else {
            getAnswer(startY, startX, size / 2);
        }
        set.clear();
        for (int i = startY; i < startY + size / 2; i++) {
            for (int j = startX + size / 2; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            answerArray[set.iterator().next()]++;
        } else {
            getAnswer(startY, startX + size / 2, size / 2);
        }
        set.clear();
        for (int i = startY + size / 2; i < startY + size; i++) {
            for (int j = startX; j < startX + size / 2; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            answerArray[set.iterator().next()]++;
        } else {
            getAnswer(startY + size / 2, startX, size / 2);
        }
        set.clear();
        for (int i = startY + size / 2; i < startY + size; i++) {
            for (int j = startX + size / 2; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            answerArray[set.iterator().next()]++;
        } else {
            getAnswer(startY + size / 2, startX + size / 2, size / 2);
        }
    }

}