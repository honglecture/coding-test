// https://www.acmicpc.net/problem/5958
// Space Exploration
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
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        String[][] array = new String[size][size];
        boolean[][] visitArray = new boolean[size][size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(!visitArray[i][j] && array[i][j].equals("*")){
                    answer++;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visitArray[y][x]){
                            continue;
                        }
                        if(array[y][x].equals(".")){
                            continue;
                        }
                        visitArray[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y +  array1[k];
                            int nextX = x +  array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}