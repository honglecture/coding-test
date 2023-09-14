// https://www.acmicpc.net/problem/1937
// 욕심쟁이 판다
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static int[][] dp;
    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        dp = new int[size][size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(dp[i][j] != -1)
                continue;
                getAnswer(i, j, 0);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(dp[i][j] > answer){
                    answer = dp[i][j];
                }
            }
        }
        
        bw.write(answer + 1 + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int startY, int startX, int count){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int startN = array[startY][startX];
        if(dp[startY][startX] >= count){
            return;
        }
        
        dp[startY][startX] = count;
        for (int i = 0; i < array1.length; i++) {
            int nextY = startY + array1[i];
            int nextX = startX + array2[i];
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
                continue;
            }
            if(array[nextY][nextX] <= startN){
                continue;
            }
            getAnswer(nextY, nextX, count + 1);
        }
    }


}