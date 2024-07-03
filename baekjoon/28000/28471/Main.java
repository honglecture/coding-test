// https://www.acmicpc.net/problem/28471
// W키가 빠진 성원이
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, -1, 0, 1, 1, 0, -1};
        int[] array2 = {0, -1, -1, -1, 1, 1, 1};
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        boolean[][] visitArray = new boolean[size][size];
        int startY = 0;
        int startX = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("F")){
                    startY = i;
                    startX = j;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(array[y][x].equals("#")){
                continue;
            }
            if(visitArray[y][x]){
                continue;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0  || nextY > size - 1 || nextX > size - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray[i].length; j++) {
                if(visitArray[i][j]){
                    answer++;
                }
            }
        }
        System.out.println(answer - 1);
        bw.flush();
        bw.close();
    }

  
}
