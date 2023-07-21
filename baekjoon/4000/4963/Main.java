// https://www.acmicpc.net/problem/4963
// 섬의 개수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            if(x == 0 && y == 0){
                break;
            }
            int[][] array = new int[y][x];
            for (int i = 0; i < y; i++) {
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = Integer.parseInt(sArray[j]);
                }
            }
            int result = getCount(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static int getCount(int[][] array){
        int result = 0;
        int[] array1 = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] array2 = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        boolean[][] visit = new boolean[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if(n == 1 && !visit[i][j]){
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visit[y][x]){
                            continue;
                        }
                        if(array[y][x] == 0){
                            continue;
                        }
                        visit[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextY > array.length - 1){
                                continue;
                            }
                            if(nextX < 0 || nextX > array[0].length - 1){
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
            }
        }
        return result;
    }
}
