// https://www.acmicpc.net/problem/4485
// 녹색 옷 입은 애가 젤다지?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while(true){
            int size  = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int[][] array = new int[size][size];
            for (int i = 0; i < array.length; i++) {
                String[] sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = Integer.parseInt(sArray[j]);
                }
            }
            int result = getAnswer(array);
            bw.write("Problem " + count + ": " +result + "\n");
            count++;
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[][] array){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        boolean[][] visitArray = new boolean[array.length][array.length];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        queue.add(new int[]{0, 0, array[0][0]});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(y == array.length - 1 && x == array.length - 1){
                result = count;
                break;
            }
            if(visitArray[y][x]){
                continue;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
                    continue;
                }
                if(visitArray[nextY][nextX]){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + array[nextY][nextX]});
            }
        }

        return result;
    }
}