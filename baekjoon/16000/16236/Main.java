// https://www.acmicpc.net/problem/16236
// 아기 상어
import java.io.*;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int count = 0;
        int startY = 0;
        int startX = 0;
        int fishSize = 2;
        int eatCount = 2;
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                if(n == 9){
                    startY = i;
                    startX = j;
                }
                array[i][j] = n;
            }
        }
        array[startY][startX] = 0;
        while(true){
            boolean[][] visitArray = new boolean[size][size];
            Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[2] == o2[2]){
                        if(o1[0] == o2[0]){
                            return o1[1] - o2[1];
                        } else {
                            return o1[0] - o2[0];
                        }
                    } else {
                        return o1[2] - o2[2];
                    }
                }
            });
            queue.add(new int[]{startY, startX, count});
            boolean flag = false;
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                int currentCount = pollArray[2];
                if(visitArray[currentY][currentX]){
                    continue;
                }
                if(array[currentY][currentX] > fishSize){
                    continue;
                }
                visitArray[currentY][currentX] = true;
                if(array[currentY][currentX] != 0 && array[currentY][currentX] < fishSize){
                    flag = true;
                    eatCount -= 1;
                    if(eatCount == 0){
                        fishSize++;
                        eatCount = fishSize;
                    }
                    startY = currentY;
                    startX = currentX;
                    count = currentCount;
                    array[currentY][currentX] = 0;
                    break;
                }
                for (int k = 0; k < array1.length; k++) {
                    int nextY = currentY + array1[k];
                    int nextX = currentX + array2[k];
                    if(nextY < 0 || nextY > array.length - 1 || nextX < 0 || nextX > array.length - 1){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX, currentCount + 1});
                }
            }
            if(!flag){
                break;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
