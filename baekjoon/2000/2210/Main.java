// https://www.acmicpc.net/problem/2210
// 숫자판 점프
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[5][5];
        Set<String> set = new HashSet<>();
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Queue<Object[]> queue = new ArrayDeque<>();
                queue.add(new Object[]{i, j, 0, ""});
                while (queue.size() != 0) {
                    Object[] pollArray = queue.poll();
                    int y = (int)pollArray[0];
                    int x = (int)pollArray[1];
                    int count = (int)pollArray[2];
                    String str = (String) pollArray[3];
                    if(count == 6){
                        set.add(str);
                        continue;
                    }
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = y + array1[k];
                        int nextX = x + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > 4 || nextX > 4){
                            continue;
                        }
                        queue.add(new Object[]{nextY, nextX, count + 1, str + array[nextY][nextX]});
                    }
                }
            }
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

    
}