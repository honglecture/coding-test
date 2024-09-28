// https://www.acmicpc.net/problem/1600
// 말이 되고픈 원숭이
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
        int answer = Integer.MAX_VALUE;
        int k = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[0]);
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        int[] array3 = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] array4 = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[][] array = new int[y][x];
        int[][] visitArray = new int[y][x];
        
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                visitArray[i][j] = -1;
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, k, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentK = pollArray[2];
            int currentCount = pollArray[3];
            if(array[currentY][currentX] == 1){
                continue;
            }
            if(currentY == y - 1 && currentX == x - 1){
                answer = Integer.min(answer, currentCount);
                continue;
            }
            if(visitArray[currentY][currentX] >= currentK){
                continue;
            }
            visitArray[currentY][currentX] = currentK;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, currentK, currentCount + 1});
            }
            if(currentK > 0){
                for (int i = 0; i < array3.length; i++) {
                    int nextY = currentY + array3[i];
                    int nextX = currentX + array4[i];
                    if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX, currentK - 1, currentCount + 1});
                }
            }
        }
        if(answer == Integer.MAX_VALUE){
            answer = -1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
