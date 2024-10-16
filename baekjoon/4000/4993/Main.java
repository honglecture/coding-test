// https://www.acmicpc.net/problem/4993
// Red and Black
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
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[1]);
            int x = Integer.parseInt(sArray[0]);
            if(y == 0 && x == 0){
                break;
            }
            String[][] array = new String[y][x];
            boolean[][] visitArray = new boolean[y][x];
            Queue<int[]> queue = new ArrayDeque<>();
            int[] array1 = {-1, 0, 1, 0};
            int[] array2 = {0, -1, 0, 1};
            int answer = 0;
            for (int i = 0; i <array.length; i++) {
                sArray = bf.readLine().split("");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = sArray[j];
                    if(array[i][j].equals("@")){
                        queue.add(new int[]{i, j});
                    }
                }
            }
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                if(visitArray[currentY][currentX]){
                    continue;
                }
                if(array[currentY][currentX].equals("#")){
                    continue;
                }
                visitArray[currentY][currentX] = true;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(visitArray[i][j]){
                        answer++;
                    }
                }
            }
            bw.write(answer + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
