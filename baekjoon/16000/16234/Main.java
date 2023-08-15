// https://www.acmicpc.net/problem/16234
// 인구 이동
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    private static int[][] array;
    private static int[][] visitArray;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int start = Integer.parseInt(sArray[1]);
        int end = Integer.parseInt(sArray[2]);
        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        getAnswer(start, end);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int start, int end){
        int[] array1 = {-1, 0 ,1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        while(true){
            boolean flag = false;
            Queue<int[]> queue = new ArrayDeque<>();
            visitArray = new int[array.length][array.length];
            int key = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(visitArray[i][j] == 0){
                        queue.add(new int[]{i, j});
                        while(queue.size() != 0){
                            int[] pollArray = queue.poll();
                            int currentY = pollArray[0];
                            int currentX = pollArray[1];
                            if(visitArray[currentY][currentX] != 0){
                                continue;
                            }
                            visitArray[currentY][currentX] = key;
                            for (int k = 0; k < array1.length; k++) {
                                int nextY = currentY + array1[k];
                                int nextX = currentX + array2[k];
                                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array.length - 1){
                                    continue;
                                }
                                int sum = Math.abs(array[currentY][currentX] - array[nextY][nextX]);
                                if(sum < start || sum > end){
                                    continue;
                                }

                                if(visitArray[nextY][nextX] != 0){
                                    continue;
                                }
                                flag = true;
                                queue.add(new int[]{nextY, nextX});
                            }
                        }
                        key++;
                    }
                }
            }
            if(!flag){
                break;
            }
            Map<Integer, List<int[]>> map = new HashMap<>();
            for (int i = 0; i < visitArray.length; i++) {
                for (int j = 0; j < visitArray.length; j++) {
                    int n = visitArray[i][j];
                    List<int[]> list = new ArrayList<>();
                    if(map.get(n) != null){
                        list = map.get(n);
                    }
                    list.add(new int[]{i, j});
                    map.put(n, list);
                }
            }
            
            for (int n : map.keySet()) {
                List<int[]> list = map.get(n);
                int sum = 0;
                int count = list.size();
                for (int i = 0; i < list.size(); i++) {
                    int[] listArray = list.get(i);
                    sum += array[listArray[0]][listArray[1]];
                }
                int avg = sum / count;
                for (int i = 0; i < list.size(); i++) {
                    int[] listArray = list.get(i);
                    array[listArray[0]][listArray[1]] = avg;
                }
            }
            answer++;
        }
        
    }


}
