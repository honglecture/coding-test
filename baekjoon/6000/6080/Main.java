// https://www.acmicpc.net/problem/6080
// Bad Grass
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
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {1, 0, -1, -1, -1, 0, 1, 1};
        String[] sArray = bf.readLine().split(" ");
        int[][] array = new int[Integer.parseInt(sArray[0])][Integer.parseInt(sArray[1])];
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(visitArray[i][j]){
                    continue;
                }
                if(array[i][j] == 0){
                    continue;
                }
                answer++;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{i, j});
                while (queue.size() != 0) {
                    int[] pollArray = queue.poll();
                    int y = pollArray[0];
                    int x = pollArray[1];
                    if(visitArray[y][x]){
                        continue;
                    }
                    if(array[y][x] == 0){
                        continue;
                    }
                    visitArray[y][x] = true;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = y + array1[k];
                        int nextX = x + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX >  array[0].length - 1){
                            continue;
                        }
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}