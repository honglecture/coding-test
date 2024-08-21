// https://www.acmicpc.net/problem/6031
// Feeding Time
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
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[0]);
        String[][] array = new String[y][x];
        boolean[][] visitArray = new boolean[y][x];
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {1, 0, -1 ,-1, -1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String str = array[i][j];
                if(str.equals("*")){
                    continue;
                }
                if(visitArray[i][j]){
                    continue;
                }
                int count = 0;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{i, j});
                while (queue.size() != 0) {
                    int[] pollArray = queue.poll();
                    int currentY = pollArray[0];
                    int currentX = pollArray[1];
                    if(array[currentY][currentX].equals("*")){
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
                        if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                            continue;
                        }
                        queue.add(new int[]{nextY, nextX});
                    }
                }
                
                answer = Integer.max(count, answer);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}