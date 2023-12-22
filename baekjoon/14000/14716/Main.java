// https://www.acmicpc.net/problem/14716
// 현수막
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
        int[] array1 = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] array2 = {0, -1, -1, -1, 0 ,1, 1, 1};
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        boolean[][] visitArray = new boolean[y][x];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1 && !visitArray[i][j]){
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int currentY = pollArray[0];
                        int currentX = pollArray[1];
                        if(visitArray[currentY][currentX]){
                            continue;
                        }
                        if(array[currentY][currentX] == 0){
                            continue;
                        }
                        visitArray[currentY][currentX] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = currentY + array1[k];
                            int nextX = currentX + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    answer++;
                }
            }
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

    
}