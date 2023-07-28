// https://www.acmicpc.net/problem/14503
// 로봇 청소기
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        sArray = bf.readLine().split(" ");
        int startY = Integer.parseInt(sArray[0]);
        int startX = Integer.parseInt(sArray[1]);
        int startD = Integer.parseInt(sArray[2]);
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        int count = 0;
        queue.add(new int[]{startY, startX, startD});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentD = pollArray[2];
            if(array[currentY][currentX] == 0){
                array[currentY][currentX] = 2;
                count++;
                queue.add(new int[]{currentY, currentX, currentD});
                System.out.println();
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                continue;
            }
            boolean flag = false;
            boolean frontFlag = false;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextY > array.length - 1){
                    continue;
                }
                if(nextX < 0 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[nextY][nextX] != 0){
                    continue;
                }
                flag = true;
            }
            if(flag){
                int nextD = currentD - 1;
                if(nextD < 0){
                    nextD = 3;
                }
                int nextY = currentY + array1[nextD];
                int nextX = currentX + array2[nextD];
                if(array[nextY][nextX] == 0){
                    frontFlag = true;
                }
                if(frontFlag){
                    queue.add(new int[]{nextY, nextX, nextD});
                } else {
                    queue.add(new int[]{currentY, currentX, nextD});
                }
            } else {
                int nextY = currentY - array1[currentD];
                int nextX = currentX - array2[currentD];
                if(array[nextY][nextX] == 1){
                    break;
                } else {
                    queue.add(new int[]{nextY, nextX, currentD});
                }
            }
        }

        

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    
}