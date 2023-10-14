// https://www.acmicpc.net/problem/1743
// 음식물 피하기
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
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 , -1};
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        boolean[][] array = new boolean[y][x];
        boolean[][] visitArray = new boolean[y][x];
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            array[n1][n2] = true;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] && !visitArray[i][j]){
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    int count = 0;
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int currentY = pollArray[0];
                        int currentX = pollArray[1];
                        if(!array[currentY][currentX]){
                            continue;
                        }
                        if(visitArray[currentY][currentX]){
                            continue;
                        }
                        visitArray[currentY][currentX] = true;
                        count++;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = currentY + array1[k];
                            int nextX = currentX + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                continue;
                            }
                            if(!array[nextY][nextX]){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    if(count > answer){
                        answer = count;
                    }
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
