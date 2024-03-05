// https://www.acmicpc.net/problem/5558
// チーズ (Cheese)
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
        int[] array2 = {0, 1, 0, -1};
        int answer = 0;
        int start = 1;
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int n = Integer.parseInt(sArray[2]);
        String[][] array = new String[y][x];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("S")){
                    startY = i;
                    startX = j;
                }
            }
        }
        while (true) {
            if(start > n){
                break;
            }
            boolean[][] visitArray = new boolean[y][x];
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{startY, startX, 0});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                int currentCount = pollArray[2];
                if(visitArray[currentY][currentX]){
                    continue;
                }
                if(array[currentY][currentX].equals("X")){
                    continue;
                }
                if(array[currentY][currentX].equals(String.valueOf(start))){
                    startY = currentY;
                    startX = currentX;
                    answer += currentCount;
                    break;
                }
                visitArray[currentY][currentX] = true;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX, currentCount + 1});
                }
            }
            start++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}