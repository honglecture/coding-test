// https://www.acmicpc.net/problem/26533
// Tractor Path
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "No";
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = {1, 0};
        int[] array2 = {0, 1};
        String[][] array = new String[size][size];
        boolean[][] visitArray = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            if(visitArray[y][x]){
                continue;
            }
            if(array[y][x].equals("x")){
                continue;
            }
            if(y == size - 1 && x ==  size - 1){
                answer = "Yes";
                break;
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
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
