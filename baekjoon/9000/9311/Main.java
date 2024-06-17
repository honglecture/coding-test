// https://www.acmicpc.net/problem/9311
// Robot in a Maze
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            int startY = 0;
            int startX = 0;
            String[][] array = new String[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < array[j].length; k++) {
                    array[j][k] = sArray[k];
                    if(array[j][k].equals("S")){
                        startY = j;
                        startX = k;
                    }
                }
            }
            int result = getAnswer(array, startY, startX);
            if(result == 0){
                bw.write("No Exit\n");
            } else {
                bw.write("Shortest Path: " + result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String[][] array, int startY, int startX){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int count = pollArray[2];
            if(visitArray[currentY][currentX]){
                continue;
            }
            if(array[currentY][currentX].equals("X")){
                continue;
            }
            if(array[currentY][currentX].equals("G")){
                result = count;
                break;
            }
            visitArray[currentY][currentX] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX >  array[0].length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        return result;
    }
}