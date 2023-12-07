// https://www.acmicpc.net/problem/17086
// 아기 상어 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        List<int[]> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 0){
                    list.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int result = getAnswer(list.get(i)[0], list.get(i)[1]);
            if(result > max){
                max = result;
            }
        }
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int y, int x){
        int result = 0;
        int[] array1 = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] array2 = {0, -1, -1, -1, 0, 1, 1, 1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{y, x, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int count = pollArray[2];
            if(array[currentY][currentX] == 1){
                result = count;
                break;
            }
            if(visitArray[currentY][currentX]){
                continue;
            }
            visitArray[currentY][currentX] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        return result;
    }

}
