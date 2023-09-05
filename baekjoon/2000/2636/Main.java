// https://www.acmicpc.net/problem/2636
// 치즈
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static int[][] array;
    private static int answer = 0;
    private static int answerCount = 0;

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
        getAnswer();
        bw.write(answer + "\n");
        bw.write(answerCount + "\n");
        bw.flush();
        bw.close();
    }


    private static void getAnswer(){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        while(true){
            Queue<int[]> queue = new ArrayDeque<>();
            int beforeCount = 0;
            boolean[][] visitArray = new boolean[array.length][array[0].length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(i == 0 || i == array.length - 1 || j == 0 || j == array[0].length - 1){
                        if(array[i][j] == 0){
                            queue.add(new int[]{i, j});
                        }
                    }
                    if(array[i][j] == 1){
                        beforeCount++;
                    }
                }
            }
            if(beforeCount == 0){
                break;
            }
            answer++;
            answerCount = beforeCount;
            List<int[]> list = new ArrayList<>();
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int y = pollArray[0];
                int x = pollArray[1];
                if(visitArray[y][x]){
                    continue;
                }
                visitArray[y][x] = true;
                if(array[y][x] == 1){
                    list.add(new int[]{y, x});
                    continue;
                }
                for (int i = 0; i < array1.length; i++) {
                    int nextY = y + array1[i];
                    int nextX = x + array2[i];
                    if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                        continue;
                    }
                    if(visitArray[nextY][nextX]){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            for (int i = 0; i < list.size(); i++) {
                array[list.get(i)[0]][list.get(i)[1]] = 0;
            }
        }
    }

}