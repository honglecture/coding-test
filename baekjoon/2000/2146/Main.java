// https://www.acmicpc.net/problem/2146
// 다리 만들기
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
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        List<int[]> borderlist = new ArrayList<>();
        int[][] islandArray = new int[size][size];
        boolean[][] visitArray = new boolean[size][size];
        int islandN = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1){
                    boolean flag = false;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = i + array1[k];
                        int nextX = j + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
                            continue;
                        }
                        if(array[nextY][nextX] == 0){
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        borderlist.add(new int[]{i, j});
                    }
                }
                if(array[i][j] == 1 && !visitArray[i][j]){
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while(queue.size() != 0){
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visitArray[y][x]){
                            continue;
                        }
                        visitArray[y][x] = true;
                        islandArray[y][x] = islandN;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
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
                    islandN++;
                }
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < borderlist.size(); i++) {
            visitArray = new boolean[size][size];
            int[] borderArray = borderlist.get(i);
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{borderArray[0], borderArray[1], 0});
            islandN = islandArray[borderArray[0]][borderArray[1]];
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int y = pollArray[0];
                int x = pollArray[1];
                int count = pollArray[2];
                if(islandArray[y][x] != islandN && array[y][x] != 0){
                    if(count < answer){
                        answer = count;
                    }
                    break;
                }
                if(visitArray[y][x]){
                    continue;
                }
                if(borderArray[0] != y && borderArray[1] != x && islandArray[y][x] == islandN && array[y][x] != 0){
                    continue;
                }
                visitArray[y][x] = true;
                for (int j = 0; j < array1.length; j++) {
                    int nextY = y + array1[j];
                    int nextX = x + array2[j];
                    if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
                        continue;
                    }
                    if(visitArray[nextY][nextX]){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX, count + 1});
                }
            }
        }
        bw.write(answer - 1 + "\n");
        bw.flush();
        bw.close();
    }
}
