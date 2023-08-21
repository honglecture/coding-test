// https://www.acmicpc.net/problem/2573
// 빙산
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    
    private static int[][] array;
    private static int[] array1 = {-1, 0, 1, 0};
    private static int[] array2 = {0, 1, 0 ,-1};

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
        int answer = 0;
        while(true){
            int count = getCount();
            if(count == 0){
                answer = 0;
                break;
            }
            if(count > 1){
                break;
            }
            answer++;
            oneYear();
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void oneYear(){
        int[][] nextArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0){
                    int count = 0;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = i + array1[k];
                        int nextX = j + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                            continue;
                        }
                        if(array[nextY][nextX] != 0){
                            continue;
                        }
                        count++;
                    }
                    int result = array[i][j] - count < 0 ? 0 : array[i][j] - count;
                    nextArray[i][j] = result;
                }
            }
        }
        for (int i = 0; i < nextArray.length; i++) {
            for (int j = 0; j < nextArray[i].length; j++) {
                array[i][j] = nextArray[i][j];
            }
        }
    }

    private static int getCount(){
        int result = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray[i].length; j++) {
                if(!visitArray[i][j] && array[i][j] != 0){
                    queue.add(new int[]{i, j});
                    result++;
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visitArray[y][x]){
                            continue;
                        }
                        visitArray[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                continue;
                            }
                            if(visitArray[nextY][nextX]){
                                continue;
                            }
                            if(array[nextY][nextX] == 0){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                }
            }
        }


        return result;
    }
}