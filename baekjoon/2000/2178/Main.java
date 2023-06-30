// https://www.acmicpc.net/problem/2178
// 미로 탐색
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
        int targetY = Integer.parseInt(sArray[0]);
        int targetX = Integer.parseInt(sArray[1]);
        int[][] mapArray = new int[targetY][targetX];
        int[][] countArray = new int[targetY][targetX];
        for (int i = 0; i < targetY; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(j)));
                mapArray[i][j] = n;
            }
        }
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 1});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(countArray[y][x] != 0){
                continue;
            }
            countArray[y][x] = count;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x +  array2[i];
                if(nextY < 0 || nextY > targetY - 1){
                    continue;
                }
                if(nextX < 0 || nextX > targetX - 1){
                    continue;
                }
                if(mapArray[nextY][nextX] == 0){
                    continue;
                }
                if(countArray[nextY][nextX] != 0){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        bw.write(countArray[targetY - 1][targetX - 1] + "\n");
        bw.flush();
        bw.close();
    }
}