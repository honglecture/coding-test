// https://www.acmicpc.net/problem/27211
// 도넛 행성
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
        boolean[][] visitArray = new boolean[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if(n == 0 && !visitArray[i][j]){
                    answer++;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int currentY = pollArray[0];
                        int currentX = pollArray[1];
                        if(visitArray[currentY][currentX]){
                            continue;
                        }
                        if(array[currentY][currentX] == 1){
                            continue;
                        }
                        visitArray[currentY][currentX] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = currentY + array1[k];
                            int nextX = currentX + array2[k];
                            if(nextY < 0){
                                nextY = y - 1;
                            }
                            if(nextX < 0){
                                nextX = x - 1;
                            }
                            if(nextY > y - 1){
                                nextY = 0;
                            }
                            if(nextX > x - 1){
                                nextX = 0;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
