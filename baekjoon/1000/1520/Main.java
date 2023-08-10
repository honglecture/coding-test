// https://www.acmicpc.net/problem/1476
// 내리막 길
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;  

public class Main {
    
    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int result = getAnswer();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(y == array.length - 1 && x == array[0].length - 1){
                result++;
                continue;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[y][x] <= array[nextY][nextX]){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        return result;
    }

}
