// https://www.acmicpc.net/problem/15242
// Knight
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int[] array1 = {-2, -2, -1, 1, 2, 2, -1, 1};
        int[] array2 = {-1, 1, -2, -2, -1, 1, 2, 2};
        String[] temp1 = bf.readLine().split("");
        String[] temp2 = bf.readLine().split("");
        boolean[][] visitArray = new boolean[8][8];
        int startY = Integer.parseInt(temp1[1]) - 1;
        int startX = temp1[0].charAt(0) - 97;
        int endY = Integer.parseInt(temp2[1]) - 1;
        int endX = temp2[0].charAt(0) - 97;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(y == endY && x == endX){
                answer = count;
                break;
            }
            if(visitArray[y][x]){
                continue;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > 7 || nextX > 7){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
