// https://www.acmicpc.net/problem/2667
// 단지번호붙이기
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        List<Integer> answerList = new ArrayList<>();
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        boolean[][] visitArray = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            String s = bf.readLine();
            for (int j = 0; j < s.length(); j++) {
                int n = Integer.parseInt(String.valueOf(s.charAt(j)));
                array[i][j] = n;
            }
        }
        while(true){
            boolean flag = true;
            int x = 0;
            int y = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] == 1 && visitArray[i][j] == false){
                        y = i;
                        x = j;
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                break;
            }
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{y, x});
            int count = 0;
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int currentY = pollArray[0];
                int currentX = pollArray[1];
                if(visitArray[currentY][currentX]){
                    continue;
                }
                count++;
                visitArray[currentY][currentX] = true;
                for (int i = 0; i < array1.length; i++) {
                    int nextY = currentY + array1[i];
                    int nextX = currentX + array2[i];
                    if(nextY < 0 || nextY > size - 1){
                        continue;
                    }
                    if(nextX < 0 || nextX > size - 1){
                        continue;
                    }
                    if(array[nextY][nextX] == 0){
                        continue;
                    }
                    if(visitArray[nextY][nextX]){
                        continue;
                    }
                    queue.add(new int[]{nextY, nextX});
                }
            }
            answerList.add(count);
        }
        
        Collections.sort(answerList);
        bw.write(answerList.size()+"\n");
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }

}