// https://www.acmicpc.net/problem/10026
// 적록색약
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        int result1 = getAnswer(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j].equals("G")){
                    array[i][j] = "R";
                }
            }
        }
        int result2 = getAnswer(array);
        bw.write(result1 + " " + result2 + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String[][] array){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        boolean[][] visit = new boolean[array.length][array.length];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit[i].length; j++) {
                if(!visit[i][j]){
                    String str = array[i][j];
                    queue.add(new int[]{i, j});
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visit[y][x]){
                            continue;
                        }
                        if(!str.equals(array[y][x])){
                            continue;
                        }
                        visit[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextY > array.length - 1){
                                continue;
                            }
                            if(nextX < 0 || nextX > array.length - 1){
                                continue;
                            }
                            if(visit[nextY][nextX]){
                                continue;
                            }
                            if(!str.equals(array[nextY][nextX])){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    result++;
                }
            }
        }
        return result;
    }
}