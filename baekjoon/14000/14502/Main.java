// https://www.acmicpc.net/problem/14502
// 연구소
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Main {

    private static int answer = 0;

    private static List<int[]> zeroList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < y; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 0){
                    zeroList.add(new int[]{i, j});
                }
            }
        }
        setAnswer(array, 0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void setAnswer(int[][] array, int count, int index){
        if(count == 3){
            int result = getCount(copyArray(array));
            if(answer < result){
                answer = result;
            }
            return;
        }
        for (int i = index; i < zeroList.size(); i++) {
            int[] zeroArray = zeroList.get(i);
            int y = zeroArray[0];
            int x = zeroArray[1];
            array[y][x] = 1;
            setAnswer(array, count + 1, i + 1);
            array[y][x] = 0;
        }
    }

    private static int getCount(int[][] array){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 2){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            array[y][x] = 2;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextY > array.length - 1){
                    continue;
                }
                if(nextX < 0 || nextX > array[0].length - 1){
                    continue;
                }
                if(array[nextY][nextX] == 0){
                    queue.add(new int[]{nextY, nextX});
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 0){
                    result += 1;
                }
            }
        }

        return result;
    }

    private static int[][] copyArray(int[][] array){
        int[][] result = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j];
            }
        }
        return result;
    }
}