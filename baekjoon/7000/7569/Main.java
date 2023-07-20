// https://www.acmicpc.net/problem/7568
// 덩치
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
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        int x = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int h = Integer.parseInt(sArray[2]);
        int[][][] array = new int[h][y][x];
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    array[i][j][k] = Integer.parseInt(sArray[k]);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    int n = array[i][j][k];
                    if(n == 1){
                        queue.add(new int[]{i, j, k});
                    }
                }   
            }
        }
        while(true){
            boolean flag = true;
            Queue<int[]> nextQueue = new ArrayDeque<>();
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentH = pollArray[0];
                int currentY = pollArray[1];
                int currentX = pollArray[2];
                int nextTop = currentH - 1;
                int nextBottom = currentH + 1;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextY > y - 1){
                        continue;
                    }
                    if(nextX < 0 || nextX > x - 1){
                        continue;
                    }
                    if(array[currentH][nextY][nextX] == 0){
                        array[currentH][nextY][nextX] = 1;
                        nextQueue.add(new int[]{currentH, nextY, nextX});
                    }
                }
                if(nextTop > -1 && nextTop < h){
                    if(array[nextTop][currentY][currentX] == 0){
                        array[nextTop][currentY][currentX] = 1;
                        nextQueue.add(new int[]{nextTop, currentY, currentX});
                    }
                }
                if(nextBottom > -1 && nextBottom < h){
                    if(array[nextBottom][currentY][currentX] == 0){
                        array[nextBottom][currentY][currentX] = 1;
                        nextQueue.add(new int[]{nextBottom, currentY, currentX});
                    }
                }
            }
            if(nextQueue.size() != 0){
                queue.addAll(nextQueue);
            } else {
                break;
            }
            count++;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    int n = array[i][j][k];
                    if(n == 0){
                        count = -1;
                    }
                }   
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}