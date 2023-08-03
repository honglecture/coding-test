// https://www.acmicpc.net/problem/2583
// 영역 구하기
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
public class Main {
    private static int[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int m = Integer.parseInt(sArray[0]);
        int n = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        array = new int[m][n];
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            sArray = bf.readLine().split(" ");
            int x1 = Integer.parseInt(sArray[0]);
            int y1 = Integer.parseInt(sArray[1]);
            int x2 = Integer.parseInt(sArray[2]);
            int y2 = Integer.parseInt(sArray[3]);
            for (int j = y1; j < y2; j++) {
                for (int j2 = x1; j2 < x2; j2++) {
                    array[j][j2] = 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 0){
                    int result = getCount(i, j);
                    answerList.add(result);
                }
            }
        }
        Collections.sort(answerList);
        bw.write(answerList.size() + "\n");
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    private static int getCount(int startY, int startX){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(array[y][x] == 1){
                continue;
            }
            array[y][x] = 1;
            result++;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 ||  nextY > array.length - 1 || nextX < 0 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[nextY][nextX] == 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        return result;
    }
}