// https://www.acmicpc.net/problem/21736
// SciComLove
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
        String[][] array = new String[y][x];
        boolean[][] visitArray = new boolean[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        int startY = 0;
        int startX = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("I")){
                    startY = i;
                    startX = j;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX});
        int answer = 0;
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            if(visitArray[currentY][currentX]){
                continue;
            }
            if(array[currentY][currentX].equals("X")){
                continue;
            }
            if(array[currentY][currentX].equals("P")){
                answer++;
            }
            visitArray[currentY][currentX] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        if(answer == 0){
            System.out.println("TT");
        } else {
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }

}
