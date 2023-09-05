// https://www.acmicpc.net/problem/17070
// 미세먼지 안녕!
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int[] array1 = {0, 1, 1};
        int[] array2 = {1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        int answer = 0;
        // type 1 2 3
        queue.add(new int[]{0, 1, 1});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int y = pollArray[0];
            int x = pollArray[1];
            int type = pollArray[2];
            if(type == 1 || type == 3){
                if(array[y][x] == 1){
                    continue;
                }
            } else if(type == 2){
                if(array[y][x] == 1 || array[y - 1][x] == 1 || array[y][x - 1] == 1){
                    continue;
                }
            }
            if(y == size - 1 && x == size - 1){
                answer++;
                continue;
            }
            for (int i = 0; i < array1.length; i++) {
                if(type == 1){
                    if(i == 2){
                        continue;
                    }
                } else if(type == 3){
                    if(i == 0){
                        continue;
                    }
                }
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1){
                    continue;
                }
                queue.add(new int[]{nextY, nextX, i + 1});
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
