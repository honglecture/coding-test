// https://www.acmicpc.net/problem/1476
// 내리막 길
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    private static int[][] array;
    private static int[][] dp;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        dp = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                dp[i][j] = -1;
            }
        }
        getAnswer(0, 0);
        
        bw.write(dp[0][0] + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int currentY, int currentX){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        if(currentY == array.length - 1 && currentX == array[0].length - 1){
            return 1;
        }
        if(dp[currentY][currentX] == -1){
            dp[currentY][currentX] = 0;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[currentY][currentX] <= array[nextY][nextX]){
                    continue;
                }
                dp[currentY][currentX] += getAnswer(nextY, nextX);
            }
        }
        return dp[currentY][currentX];
    }

}
