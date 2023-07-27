// https://www.acmicpc.net/problem/1987
// 알파벳
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static String[][] array;
    private static boolean[] visitArray;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new String[y][x];
        for (int i = 0; i < y; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        visitArray = new boolean[26];
        visitArray[((int)array[0][0].charAt(0)) - 65] = true;
        getAnswer(0, 0, 1);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int y, int x, int count){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int n = ((int)array[y][x].charAt(0)) - 65;
        for (int i = 0; i < array1.length; i++) {
            int nextY = y + array1[i];
            int nextX = x + array2[i];
            if(nextY < 0 || nextY > array.length - 1){
                continue;
            }
            if(nextX < 0 || nextX > array[0].length - 1){
                continue;
            }
            int nextN = ((int)array[nextY][nextX].charAt(0)) - 65;
            if(visitArray[nextN]){
                if(count > answer){
                    answer = count;
                }   
                continue;
            }
            visitArray[nextN] = true;
            getAnswer(nextY, nextX, count + 1);
            visitArray[nextN] = false;
        }
    }
}