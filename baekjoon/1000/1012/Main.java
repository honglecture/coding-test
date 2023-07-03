// https://www.acmicpc.net/problem/1012
// 유기농 배추
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray =  bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int[][] array = new int[n2][n1];
            for (int j = 0; j < n3; j++) {
                sArray =  bf.readLine().split(" ");
                int x = Integer.parseInt(sArray[0]);
                int y = Integer.parseInt(sArray[1]);
                array[y][x] = 1;
            }
            int result = getAnswer(array);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[][] array){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        while(true){
            boolean flag = true;
            int y = 0;
            int x = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int n = array[i][j];
                    if(n == 1 && visitArray[i][j] == false){
                        y = i;
                        x = j;
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                break;
            }
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{y, x});
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                if(visitArray[currentY][currentX]){
                    continue;
                }
                visitArray[currentY][currentX] = true;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextY > array.length - 1){
                        continue;
                    }
                    if(nextX < 0 || nextX > array[0].length - 1){
                        continue;
                    }
                    if(array[nextY][nextX] == 0){
                        continue;
                    }
                    if(visitArray[nextY][nextX]){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            result++;
        }
        return result;
    }

}