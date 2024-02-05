// https://www.acmicpc.net/problem/16433
// 주디와 당근농장
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int r = Integer.parseInt(sArray[1]) - 1;
        int c = Integer.parseInt(sArray[2]) - 1;
        boolean[][] array = new boolean[n][n];
        int[] array1 = {-1, 1, 1, -1};
        int[] array2 = {-1, -1, 1, 1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{r, c});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(array[y][x]){
                continue;
            }
            array[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > n - 1 || nextX  > n - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]){
                    bw.write("v");
                } else {
                    bw.write(".");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    


}
