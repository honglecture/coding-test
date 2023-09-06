// https://www.acmicpc.net/problem/2589
// 보물섬
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    private static String[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new String[y][x];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String s = array[i][j];
                if(s.equals("L")){
                    int result = getAnswer(i, j);
                    if(result > answer){
                        answer = result;
                    }
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int startY, int startX){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int[][] visitaArray = new int[array.length][array[0].length];
        for (int i = 0; i < visitaArray.length; i++) {
            for (int j = 0; j < visitaArray[i].length; j++) {
                visitaArray[i][j] = -1;
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(array[y][x].equals("W")){
                continue;
            }
            if(visitaArray[y][x] != -1){
                continue;
            }
            visitaArray[y][x] = count;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                if(visitaArray[nextY][nextX] != -1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        int max = -1;
        for (int i = 0; i < visitaArray.length; i++) {
            for (int j = 0; j < visitaArray[0].length; j++) {
                if(visitaArray[i][j] > max){
                    max = visitaArray[i][j];
                }
            }
        }
        return max;
    }


}