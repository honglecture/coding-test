// https://www.acmicpc.net/problem/11123
// 양 한마리... 양 두마리... 
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            String[][] array = new String[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k];
                }
            }
            int result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String[][] array){
        int result = 0;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        boolean[][] visitArray = new boolean[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String str = array[i][j];
                if(str.equals("#") && !visitArray[i][j]){
                    result++;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visitArray[y][x]){
                            continue;
                        }
                        if(array[y][x].equals(".")){
                            continue;
                        }
                        visitArray[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                }
            }
        }
        return result;
    }
    
}