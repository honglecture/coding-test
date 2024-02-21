// https://www.acmicpc.net/problem/14430
// 자원 캐기
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
        int[][] visitArray = new int[y][x];
        int[] array1 = {0, 1};
        int[] array2 = {1, 0};
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentCount = pollArray[2];
            if(visitArray[currentY][currentX] > currentCount){
                continue;
            }
            visitArray[currentY][currentX] = currentCount + array[currentY][currentX];
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY > y - 1 || nextX > x - 1 || nextY < 0 || nextX < 0){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, currentCount + array[currentY][currentX]});
                
            }
        }
        System.out.println(visitArray[y - 1][x - 1]);
        bw.flush();
        bw.close();
    }


}