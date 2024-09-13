// https://www.acmicpc.net/problem/9790
// Elephant Show
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            if(x == 0 && y == 0){
                break;
            }
            String[][] array = new String[y][x];
            boolean[][] visitArray = new boolean[y][x];
            int startY = 0;
            int startX = 0;
            for (int i = 0; i < array.length; i++) {
                sArray = bf.readLine().split("");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = sArray[j];
                    if(array[i][j].equals("A")){
                        startY = i;
                        startX = j;
                    }
                }
            }
            int answer = 0;
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{startY, startX});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                if(array[currentY][currentX].equals("#")){
                    continue;
                }
                if(visitArray[currentY][currentX]){
                    continue;
                }
                answer++;
                visitArray[currentY][currentX] = true;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX >  array[0].length - 1){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}