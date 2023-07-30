// https://www.acmicpc.net/problem/14500
// 테트로미노
import java.io.*;
public class Main {

    private static int[][] array;
    private static boolean[][] visitArray;
    private static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        visitArray = new boolean[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                getAnswer(i, j);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                visitArray[i][j] = true;
                
                getAnswer(i, j, 1, array[i][j]);
                visitArray[i][j] = false;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int startY, int startX){
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int sum = array[startY][startX];
        for (int i = 0; i < 4; i++) {
            int result = 0;
            for (int j = 0; j < array1.length; j++) {
                if(i == j){
                    continue;
                }
                int nextY = startY + array1[j];
                int nextX = startX + array2[j];
                if(nextY < 0 || nextY > array.length - 1){
                    result = 0;
                    continue;
                }
                if(nextX < 0 || nextX > array[0].length - 1){
                    result = 0;
                    continue;
                }
                result += array[nextY][nextX];
            }
            if(result != 0){
                if(result + sum > answer){
                    answer = result + sum;
                }
            }
        }
    }

    private static void getAnswer(int startY, int startX, int count, int sum){
        if(count == 4){
            if(answer < sum){
                answer = sum;
            }
            return;
        }
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        for (int i = 0; i < array1.length; i++) {
            int nextY = startY + array1[i];
            int nextX = startX + array2[i];
            if(nextY < 0 || nextY > array.length - 1){
                continue;
            }
            if(nextX < 0 || nextX > array[i].length - 1){
                continue;
            }
            if(visitArray[nextY][nextX]){
                continue;
            }
            visitArray[nextY][nextX] = true;
            getAnswer(nextY, nextX, count + 1, sum + array[nextY][nextX]);
            visitArray[nextY][nextX] = false;
        }
    }

}