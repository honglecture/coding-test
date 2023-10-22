// https://www.acmicpc.net/problem/17406
// 배열 돌리기 4
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static int[][] array;
    private static int[][] orderArray;
    private static boolean[] visitArray;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        orderArray = new int[size][3];
        visitArray = new boolean[size];
        for (int i = 0; i < orderArray.length; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            orderArray[i][0] = n1;
            orderArray[i][1] = n2;
            orderArray[i][2] = n3;
        }
        getAnswer(0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == orderArray.length){
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
                if(answer > sum){
                    answer = sum;
                }
            }
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                // 여기서 실행 후
                int[][] copyArray = getCopyArray();
                op(i);
                getAnswer(count + 1, index + 1);
                // 여기서 되돌리기
                for (int j = 0; j < array.length; j++) {
                    for (int k = 0; k < array[j].length; k++) {
                        array[j][k] = copyArray[j][k];
                    }
                }
                visitArray[i] = false;
            }
        }
    }

    private static int[][] getCopyArray(){
        int[][] copyArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copyArray[i][j] = array[i][j];
            }
        }
        return copyArray;
    }
    private static void op(int index){
        int r = orderArray[index][0];
        int c = orderArray[index][1];
        int s = orderArray[index][2];
        int startY = r - s - 1;
        int startX = c - s - 1;
        int endY = r + s - 1;
        int endX = c + s - 1;
        while(true){
            if(startY >= endY){
                break;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = startX; i <= endX; i++) {
                list.add(array[startY][i]);
            }
            for (int i = startY + 1; i <= endY - 1; i++) {
                list.add(array[i][endX]);
            }
            for (int i = endX; i >= startX; i--) {
                list.add(array[endY][i]);
            }
            for (int i = endY - 1; i >= startY + 1; i--) {
                list.add(array[i][startX]);
            }
            int lastNum = list.get(list.size() - 1);
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(lastNum);
            for (int i = 0; i < list.size() - 1; i++) {
                queue.add(list.get(i));
            }
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
