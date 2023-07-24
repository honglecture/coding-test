// https://www.acmicpc.net/problem/2468
// 안전 영역
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int answer = 1;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] > max){
                    max = array[i][j];
                }
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        for (int i = min; i <= max; i++) {
            int result = getCount(array, i);
            if(answer < result){
                answer = result;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    private static int getCount(int[][] array, int n){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        List<int[]> list = new ArrayList<>();
        boolean[][] visit = new boolean[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] <= n){
                    array[i][j] = 0;
                } else {
                    list.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int y = list.get(i)[0];
            int x = list.get(i)[1];
            if(visit[y][x]){
                continue;
            }
            queue.add(new int[]{y, x});
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                if(visit[currentY][currentX]){
                    continue;
                }
                if(array[currentY][currentX] == 0){
                    continue;
                }
                visit[currentY][currentX] = true;
                for (int j = 0; j < array1.length; j++) {
                    int nextY = currentY + array1[j];
                    int nextX = currentX + array2[j];
                    if(nextY < 0 || nextY > array.length - 1){
                        continue;
                    }
                    if(nextX < 0 || nextX > array.length - 1){
                        continue;
                    }
                    if(visit[nextY][nextX]){
                        continue;
                    }
                    if(array[nextY][nextX] == 0){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            result++;
        }

        

        return result;
    }
}