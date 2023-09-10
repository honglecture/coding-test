// https://www.acmicpc.net/problem/1926
// 그림
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
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        
        boolean[][] visitArray = new boolean[y][x];
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray[i].length; j++) {
                if(array[i][j] == 1 && visitArray[i][j] == false){
                    count++;
                    int innerCount = 0;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int currentY = pollArray[0];
                        int currentX = pollArray[1];
                        if(visitArray[currentY][currentX]){
                            continue;
                        }
                        visitArray[currentY][currentX] = true;
                        innerCount++;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = currentY + array1[k];
                            int nextX = currentX + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                continue;
                            }
                            if(array[nextY][nextX] == 0){
                                continue;
                            }
                            if(visitArray[nextY][nextX]){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    if(maxCount < innerCount){
                        maxCount = innerCount;
                    }
                }
            }
        }

        bw.write(count + "\n");
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
    }
}