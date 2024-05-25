// https://www.acmicpc.net/problem/13354
// Artwork
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int x = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int startX = Integer.parseInt(sArray[0]) - 1;
            int startY = Integer.parseInt(sArray[1]) - 1;
            int endX = Integer.parseInt(sArray[2]) - 1;
            int endY = Integer.parseInt(sArray[3]) - 1;
            for (int j = startY; j <= endY; j++) {
                for (int k = startX; k <= endX; k++) {
                    array[j][k] = "*";
                }
            }
            int result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String[][] array){
        int result = 0;
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(".") && !visitArray[i][j]){
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(array[y][x].equals("*")){
                            continue;
                        }
                        if(visitArray[y][x]){
                            continue;
                        }
                        visitArray[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
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