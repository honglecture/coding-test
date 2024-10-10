// https://www.acmicpc.net/problem/6004
// The Chivalrous Cow
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
        int startY = 0;
        int startX = 0;
        int endY = 0;
        int endX = 0;
        int answer = 0;
        int[][] array1 = {
            {-1, -1}, {-1, -1}, {0, -1}, {0, 1}, {1, 1}, {1, 1}, {0, 1}, {0, -1}
        };
        int[][] array2 = {
            {0, 1}, {0, -1}, {-1, -1}, {-1, -1}, {0, -1}, {0, 1}, {1, 1}, {1, 1}
        };
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("K")){
                    startY = i;
                    startX = j;
                } else if(array[i][j].equals("H")){
                    endY = i;
                    endX = j;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int count = pollArray[2];
            if(currentY == endY && currentX == endX){
                answer = count;
                break;
            }
            if(visitArray[currentY][currentX]){
                continue;
            }
            visitArray[currentY][currentX] = true;
            for (int i = 0; i < array1.length; i++) {
                boolean flag = true;
                int nextY = currentY;
                int nextX = currentX;
                for (int j = 0; j < array1[i].length; j++) {
                    nextY = nextY + array1[i][j];
                    nextX = nextX + array2[i][j];
                    if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                        flag = false;
                        break;
                    }
                    if(array[nextY][nextX].equals("*")){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    queue.add(new int[]{nextY, nextX, count + 1});
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}