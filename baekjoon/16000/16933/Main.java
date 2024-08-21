// https://www.acmicpc.net/problem/16933
// 벽 부수고 이동하기 3
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0 ,1};
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int n = Integer.parseInt(sArray[2]);
        boolean[][] visitArray = new boolean[y][x];
        int[][] array = new int[y][x];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 0, 1});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentCount = pollArray[2];
            int sum = pollArray[3];
            if(currentY == y - 1 && currentX == x - 1){
                
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
