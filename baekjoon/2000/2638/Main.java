// https://www.acmicpc.net/problem/2638
// 치즈
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Main {

    private static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[][] checkArray = {
             {0, 0}
            ,{0, x - 1}
            ,{y - 1, 0}
            ,{y - 1, x - 1}
        };
        int answer = 0;
        while (true) {
            if(isEmpty()){
                break;
            }
            answer++;
            boolean[][] visitArray = new boolean[y][x];
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < checkArray.length; i++) {
                int startY = checkArray[i][0];
                int startX = checkArray[i][1];
                Queue<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{startY, startX});
                while (queue.size() != 0) {
                    int[] pollArray = queue.poll();
                    int currentY = pollArray[0];
                    int currentX = pollArray[1];
                    if(visitArray[currentY][currentX]){
                        continue;
                    }
                    if(array[currentY][currentX] == 1){
                        list.add(new int[]{currentY, currentX});
                        visitArray[currentY][currentX] = true;
                        continue;
                    }
                    visitArray[currentY][currentX] = true;
                    for (int j = 0; j < array1.length; j++) {
                        int nextY = currentY + array1[j];
                        int nextX = currentX + array2[j];
                        if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                            continue;
                        }
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
            List<int[]> removeList = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                int currentY = list.get(j)[0];
                int currentX = list.get(j)[1];
                int count = 0;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(array[nextY][nextX] == 0 && visitArray[nextY][nextX]){
                        count++;
                    }
                }
                if(count > 1){
                    removeList.add(new int[]{currentY, currentX});
                }
            }

            for (int i = 0; i <removeList.size(); i++) {
                array[removeList.get(i)[0]][removeList.get(i)[1]] = 0;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
    private static boolean isEmpty(){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }

}