// https://www.acmicpc.net/problem/2665
// 미로만들기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

import javax.xml.namespace.QName;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int[][] dp = new int[size][size];
        int endY = dp.length - 1;
        int endX = dp[0].length - 1;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                array[i][j] = n;
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(array[y][x] == 0){
                count++;
            }
            if(dp[y][x] <= count){
                continue;
            }
            dp[y][x] = count;
            if(y == endY && x == endX){
                continue;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count});
            }
        }
        


        bw.write(dp[size - 1][size - 1] + "\n");

        bw.flush();
        bw.close();
    }
}