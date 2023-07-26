// https://www.acmicpc.net/problem/1992
// 쿼드트리
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        Set<Integer> set = new HashSet<>();
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                set.add(array[i][j]);
            }
        }
        result = getAnswer(0, 0, size);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    private static String getAnswer(int startY, int startX, int size){
        String result = "";
        Set<Integer> set = new HashSet<>();
        for (int i = startY; i < startY + size; i++) {
            for (int j = startX; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            result += set.iterator().next() + "";
            return result;
        }
        set.clear();
        result = "(";
        for (int i = startY; i < startY + size / 2; i++) {
            for (int j = startX; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            result += set.iterator().next();
        } else {
            result += getAnswer(startY, startX, size / 2);
        }
        set.clear();
        for (int i = startY; i < startY + size / 2; i++) {
            for (int j = startX + size / 2; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            result += set.iterator().next();
        } else {
            result += getAnswer(startY, startX + size / 2, size / 2);
        }
        set.clear();
        for (int i = startY + size / 2; i < startY + size; i++) {
            for (int j = startX; j < startX + size / 2; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            result += set.iterator().next();
        } else {
            result += getAnswer(startY + size / 2, startX, size / 2);
        }
        set.clear();
        for (int i = startY + size / 2; i < startY + size; i++) {
            for (int j = startX + size / 2; j < startX + size; j++) {
                set.add(array[i][j]);
            }
        }
        if(set.size() == 1){
            result += set.iterator().next();
        } else {
            result += getAnswer(startY + size / 2, startX + size / 2, size / 2);
        }
        result += ")";
        return result;
    }

}