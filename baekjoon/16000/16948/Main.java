// https://www.acmicpc.net/problem/16948
// 데스 나이트
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        boolean[][] visitArray = new boolean[size][size];
        String[] sArray = bf.readLine().split(" ");
        int startY = Integer.parseInt(sArray[0]);
        int startX = Integer.parseInt(sArray[1]);
        int endY = Integer.parseInt(sArray[2]);
        int endX = Integer.parseInt(sArray[3]);
        int[] array1 = {-2, -2, 0, 0, 2, 2};
        int[] array2 = {-1, 1, -2, 2, -1, 1};
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(visitArray[y][x]){
                continue;
            }
            if(y == endY && x == endX){
                answer = count;
                break;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        if(answer == 0){
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }

}
