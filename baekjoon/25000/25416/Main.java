// https://www.acmicpc.net/problem/25416
// 빠른 숫자 탐색
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = -1;
        int[][] array = new int[5][5];
        int[] array1 = {-1, 0 ,1, 0};
        int[] array2 = {0 ,1, 0, -1};
        boolean[][] visitArray = new boolean[5][5];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        String[] sArray = bf.readLine().split(" ");
        queue.add(new int[]{Integer.parseInt(sArray[0]), Integer.parseInt(sArray[1]), 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(visitArray[y][x]){
                continue;
            }
            if(array[y][x] == -1){
                continue;
            }
            if(array[y][x] == 1){
                answer = count;
                break;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > 4 || nextX > 4){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
