// https://www.acmicpc.net/problem/16509
// 장군
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-3, -2, 2, 3, 3, 2, -2, -3};
        int[] array2 = {-2, -3, -3, -2, 2, 3, 3, 2};
        int answer = -1;
        boolean[][] visitArray = new boolean[10][9];
        String[] sArray = bf.readLine().split(" ");
        int startY = Integer.parseInt(sArray[0]);
        int startX = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int endY = Integer.parseInt(sArray[0]);
        int endX = Integer.parseInt(sArray[1]);
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
                if(nextY < 0 || nextX < 0 || nextY > visitArray.length - 1 || nextX > visitArray[0].length - 1){
                    continue;
                }
                if(!checkAnswer(y, x, endY, endX, i)){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static boolean checkAnswer(int startY, int startX, int endY, int endX, int index){
        boolean flag = true;
        int[][] array = {
             {-1, 0, -1, -1}
            ,{0, -1, -1, -1}
            ,{0, -1, 1, -1}
            ,{1, 0, 1, -1}
            ,{1, 0, 1, 1}
            ,{0, 1, 1, 1}
            ,{0, 1, -1, 1}
            ,{-1, 0, -1, 1}
        };
        int y = startY;
        int x = startX;
        for (int i = 0; i < array[index].length; i+=2) {
            y += array[index][i];
            x += array[index][i + 1];
            if(y == endY && x == endX){
                flag = false;
                break;
            }
        }
        return flag;
    }

    


}
