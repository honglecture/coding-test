// https://www.acmicpc.net/problem/7562
// 나이트의 이동
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    private static int[][] array;
    private static int startY;
    private static int startX;
    private static int endY;
    private static int endX;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            array = new int[n][n];
            startY = Integer.parseInt(sArray1[0]);
            startX = Integer.parseInt(sArray1[1]);
            endY = Integer.parseInt(sArray2[0]);
            endX = Integer.parseInt(sArray2[1]);
            int result = getAnswer();
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }



    private static int getAnswer(){
        int[] array1 = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] array2 = {-1, 1, 2, 2, 1, -1, -2, -2};
        int result = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[2] - o2[2];
            }
        });
        queue.add(new int[]{startY, startX, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int count = pollArray[2];
            if(array[y][x] != 0){
                continue;
            }
            if(y == endY && x == endX){
                result = count;
                break;
            }
            array[y][x] = count;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextY > array.length - 1){
                    continue;
                }
                if(nextX < 0 || nextX > array.length - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, count + 1});
            }
        }
        return result;
    }
}