// https://www.acmicpc.net/problem/1937
// 욕심쟁이 판다
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    private static boolean[][] visitArray;
    private static int[][] dp;
    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        dp = new int[size][size];
        visitArray = new boolean[size][size];
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                queue.add(new int[]{array[i][j], i, j});
            }
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n1 = pollArray[1];
            int n2 = pollArray[2];
            if(visitArray[n1][n2]){
                continue;
            }
            int result = getAnswer(n1, n2);
            dp[n1][n2] = result;
            visitArray[n1][n2] = true;
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

    private static int getAnswer(int startY, int startX){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int max = Integer.MIN_VALUE;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            int sum = count + dp[y][x];
            if(max < sum){
                max = sum;
            }
            if(visitArray[y][x] || dp[y][x] != 0){
                continue;
            }
            boolean flag = false;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[y][x] >= array[nextY][nextX]){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
                flag = true;
            }
            if(!flag)
                visitArray[y][x] = true;
        }
        return max;
    }


}