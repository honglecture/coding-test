// https://www.acmicpc.net/problem/5931
// Cow Beauty Pageant
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
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0 ,1};
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] visitArray = new int[y][x];
        String[][] array = new String[y][x];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(".")){
                    continue;
                }
                if(visitArray[i][j] != 0){
                    continue;
                }
                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{i, j, index});
                while (queue.size() != 0) {
                    int[] pollArray = queue.poll();
                    int currentY = pollArray[0];
                    int currentX = pollArray[1];
                    int currentIndex = pollArray[2];
                    if(array[currentY][currentX].equals(".")){
                        continue;
                    }
                    if(visitArray[currentY][currentX] != 0){
                        continue;
                    }
                    visitArray[currentY][currentX] = currentIndex;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = currentY + array1[k];
                        int nextX = currentX + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                            continue;
                        }
                        queue.add(new int[]{nextY, nextX, currentIndex});
                    }
                }
                index++;
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray[i].length; j++) {
                if(visitArray[i][j] == 1){
                    int result = getAnswer(visitArray, i, j);
                    answer = Integer.min(answer, result);
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    private static int getAnswer(int[][] array, int startY, int startX){
        int answer = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0 ,1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        visitArray[startY][startX] = true;
        for (int i = 0; i < array1.length; i++) {
            int nextY = startY + array1[i];
            int nextX = startX + array2[i];
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                continue;
            }
            queue.add(new int[]{nextY, nextX, 1});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(visitArray[y][x]){
                continue;
            }
            if(array[y][x] == 1){
                continue;
            }
            if(array[y][x] == 2){
                answer = count;
                break;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        if(answer == 0){
            answer = Integer.MAX_VALUE;
        }
        return answer - 1;
    }
}