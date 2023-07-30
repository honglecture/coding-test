// https://www.acmicpc.net/problem/2206
// 벽 부수고 이동하기
import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    private static int[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int startY = 0;
        int startX = 0;
        int endY = y - 1;
        int endX = x - 1;
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int result = getAnswer(startY, startX, endY, endX);
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int startY, int startX, int endY, int endX){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int[][] visit = new int[array.length][array[0].length];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[3] == o1[3]){
                    return o1[2] - o2[2];
                } else {
                    return o1[3] - o2[3];
                }
            }
        });
        queue.add(new int[]{startY, startX, 1, 1});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int wall = pollArray[2];
            int sum = pollArray[3];
            if(visit[y][x] == wall){
                continue;
            }
            if(y == endY && x == endX){
                result = sum;
                break;
            }
            visit[y][x] = wall;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextY > array.length - 1){
                    continue;
                }
                if(nextX < 0 || nextX > array[0].length - 1){
                    continue;
                }
                if(visit[nextY][nextX] == wall){
                    continue;
                }
                if(array[nextY][nextX] == 0){
                    queue.add(new int[]{nextY, nextX, wall, sum + 1});
                } else {
                    if(wall == 2){
                        continue;
                    } else if(wall == 1) {
                        queue.add(new int[]{nextY, nextX, 2, sum + 1});
                    }
                }
            }
        }
        if(result == 0){
            result = -1;
        }
        return result;
    }
}