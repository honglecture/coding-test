// https://www.acmicpc.net/problem/14940
// 쉬운 최단거리
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int[][] dp = new int[y][x];
        int[] array1 = {-1, 0 , 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int startY = 0;
        int startX = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                dp[i][j] = Integer.MAX_VALUE;
                if(array[i][j] == 2){
                    startY = i;
                    startX = j;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int count = pollArray[2];
            if(dp[currentY][currentX] != Integer.MAX_VALUE){
                continue;
            }
            if(array[currentY][currentX] == 0){
                continue;
            }
            dp[currentY][currentX] = count;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(dp[nextY][nextX] != Integer.MAX_VALUE){
                    continue;
                }
                if(array[nextY][nextX] == 0){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                int dpNum = dp[i][j];
                int arrayNum = array[i][j];
                if(arrayNum == 1 && dpNum == Integer.MAX_VALUE){
                    dp[i][j] = -1;
                } else if(arrayNum == 0 && dpNum == Integer.MAX_VALUE){
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                bw.write(dp[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
}