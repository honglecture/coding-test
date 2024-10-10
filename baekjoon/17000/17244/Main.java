// https://www.acmicpc.net/problem/17244
// 아맞다우산
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[0]);
        String[][] array = new String[y][x];
        int[] array1 = {-1, 0 , 1 ,0};
        int[] array2 = {0, -1, 0, 1};
        int startY = 0;
        int startX = 0;
        int keyCount = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("S")){
                    startY = i;
                    startX = j;
                } else if(array[i][j].equals("X")){
                    keyCount++;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX, 0, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int currentKey = pollArray[2];
            int count = pollArray[3];
            if(currentKey == keyCount){
                if(array[currentY][currentX].equals("E")){
                    answer = count;
                    break;
                }
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                    continue;
                }
                if(array[nextY][nextX].equals("#")){
                    continue;
                }
            }
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}
