// https://www.acmicpc.net/problem/3190
// 뱀
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        String[] dArray = new String[10001];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        int currentD = 1;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            array[y - 1][x - 1] = 1;
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
             String[] sArray = bf.readLine().split(" ");
             int t = Integer.parseInt(sArray[0]);
             String d = sArray[1];
             dArray[t] = d;
        }
        int count = 0;
        while(true){
            int[] pollArray = queue.peek();
            int currentY = pollArray[0];
            int currentX = pollArray[1];
            int nextY = currentY + array1[currentD];
            int nextX = currentX + array2[currentD];
            if(nextY < 0 || nextY > array.length - 1 || nextX < 0 || nextX > array.length - 1){
                break;
            }
            if(array[nextY][nextX] == 2){
                break;
            }
            count++;
            if(array[nextY][nextX] == 1){
                queue.addFirst(new int[]{nextY, nextX});
                array[nextY][nextX] = 2;
            } else {
                int[] removeArray = queue.pollLast();
                array[removeArray[0]][removeArray[1]] = 0;
                queue.addFirst(new int[]{nextY, nextX});
                System.out.println(queue.size());
                array[nextY][nextX] = 2;
            }
            if(dArray[count] != null){
                if(dArray[count].equals("L")){
                    if(currentD == 1){
                        currentD = 0;
                    } else if(currentD == 2){
                        currentD = 1;
                    } else if(currentD == 3){
                        currentD = 2;
                    } else if(currentD == 0){
                        currentD = 3;
                    } 
                } else {
                    if(currentD == 1){
                        currentD = 2;
                    } else if(currentD == 2){
                        currentD = 3;
                    } else if(currentD == 3){
                        currentD = 0;
                    } else if(currentD == 0){
                        currentD = 1;
                    } 
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        bw.write(count + 1 + "\n");
        bw.flush();
        bw.close();
    }
}