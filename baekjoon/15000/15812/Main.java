// https://www.acmicpc.net/problem/15812
// 침략자 진아
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if(i == j && k == l){
                            continue;
                        }
                        if(array[i][j] == 1 || array[k][l] == 1){
                            continue;
                        }
                        int[][] copyArray = copyArray(array);
                        int result = getAnswer(copyArray, i, j, k, l);
                        answer = Integer.min(answer, result);
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[][] array, int y1, int x1, int y2, int x2){
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        int answer = Integer.MAX_VALUE;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{y1, x1, 0});
        queue.add(new int[]{y2, x2, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(visitArray[y][x]){
                continue;
            }
            visitArray[y][x] = true;
            array[y][x] = 0;
            if(checkArray(array)){
                answer = count;
                break;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX , count + 1});
            }
        }
        return answer;
    }

    private static boolean checkArray(int[][] array){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }

    private static int[][] copyArray(int[][] array){
        int[][] copyArray = new int[array.length][array[0].length];
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                copyArray[i][j] = array[i][j];
            }
        }
        return copyArray;
    }

    
}