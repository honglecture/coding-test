// https://www.acmicpc.net/problem/16926
// 배열 돌리기 1
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Main {

    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int count = Integer.parseInt(sArray[2]);
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < count; i++) {
            getAnswer();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }


    private static void getAnswer(){
        int startY = 0;
        int startX = 0;
        int endY = array.length - 1;
        int endX = array[0].length - 1;
        while (true) {
            if(startY >= endY){
                break;
            }
            if(startX >= endX){
                break;
            }
            Deque<Integer> queue = new ArrayDeque<>();
            for (int i = startX; i <= endX; i++) {
                queue.add(array[startY][i]);
            }
            for (int i = startY + 1; i <= endY - 1; i++) {
                queue.add(array[i][endX]);
            }
            for (int i = endX; i >= startX; i--) {
                queue.add(array[endY][i]);
            }
            for (int i = endY - 1; i >= startY + 1; i--) {
                queue.add(array[i][startX]);
            }
            int temp = queue.pollFirst();
            queue.addLast(temp);
            for (int i = startX; i <= endX; i++) {
                array[startY][i] = queue.poll();
            }
            for (int i = startY + 1; i <= endY - 1; i++) {
                array[i][endX] = queue.poll();
            }
            for (int i = endX; i >= startX; i--) {
                array[endY][i] = queue.poll();
            }
            for (int i = endY - 1; i >= startY + 1; i--) {
                array[i][startX] = queue.poll();
            }
            startY++;
            startX++;
            endY--;
            endX--;
        }

    }

}
