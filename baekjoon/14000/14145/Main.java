// https://www.acmicpc.net/problem/14145
// Žetva
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[][] answerArray = getAnswer(array);
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j]+ "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static int[][] getAnswer(int[][] array){
        List<Integer> list = new ArrayList<>();
        Map<Integer, List<int[]>> map = new HashMap<>();
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        int[][] answerArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 0){
                    continue;
                }
                if(visitArray[i][j]){
                    continue;
                }
                int count = 0;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{i, j});
                List<int[]> innerList = new ArrayList<>();
                while (queue.size() != 0) {
                    int[] pollArray = queue.poll();
                    int y = pollArray[0];
                    int x = pollArray[1];
                    if(visitArray[y][x]){
                        continue;
                    }
                    if(array[y][x] == 0){
                        continue;
                    }
                    visitArray[y][x] = true;
                    innerList.add(new int[]{y, x});
                    count++;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = y + array1[k];
                        int nextX = x + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                            continue;
                        }
                        queue.add(new int[]{nextY, nextX});
                    }
                }
                list.add(count);
                map.put(count, innerList);
            }
        }
        Collections.sort(list);
        for (int key : map.keySet()) {
            List<int[]> innerList = map.get(key);
            for (int i = 0; i < innerList.size(); i++) {
                int y = innerList.get(i)[0];
                int x = innerList.get(i)[1];
                answerArray[y][x] = list.indexOf(key) + 1;
            }
        }
        return answerArray;
    }


}