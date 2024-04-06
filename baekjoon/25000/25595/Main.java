// https://www.acmicpc.net/problem/25595
// 86 ─에이티식스─ 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String answer = "Lena";
        int[][] array = new int[size][size];
        boolean[][] visitArray = new boolean[size][size];
        int[] array1 = {-1, -1, 1, 1};
        int[] array2 = {-1, 1, 1, -1};
        int startY = 0;
        int startX = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 2){
                    startY = i;
                    startX = j;
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY, startX});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(visitArray[y][x]){
                continue;
            }
            visitArray[y][x] = true;
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX});
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray.length; j++) {
                boolean flag = visitArray[i][j];
                int n = array[i][j];
                if(flag && n == 1){
                    answer = "Kiriya";
                    break;
                }
            }
            if(answer.equals("Kiriya")){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
