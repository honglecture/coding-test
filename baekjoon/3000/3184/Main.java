// https://www.acmicpc.net/problem/3184
// 양
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

import javax.xml.namespace.QName;

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
        int[] array2 = {0, 1, 0, -1};
        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String s = array[i][j];
                if(s.equals(".") || s.equals("o") || s.equals("v")){
                    if(!visitArray[i][j]){
                        int count1 = 0;
                        int count2 = 0;
                        Queue<int[]> queue = new ArrayDeque<>();
                        queue.add(new int[]{i, j});
                        while (queue.size() != 0) {
                            int[] pollArray = queue.poll();
                            int currentY = pollArray[0];
                            int currentX = pollArray[1];
                            if(visitArray[currentY][currentX]){
                                continue;
                            }
                            if(array[currentY][currentX].equals("#")){
                                continue;
                            }
                            visitArray[currentY][currentX] = true;
                            String type = array[currentY][currentX];
                            if(type.equals("o")){
                                count1++;
                            } else if(type.equals("v")){
                                count2++;
                            }
                            for (int k = 0; k < array1.length; k++) {
                                int nextY = currentY + array1[k];
                                int nextX = currentX + array2[k];
                                if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                                    continue;
                                }
                                queue.add(new int[]{nextY, nextX});
                            }
                        }
                        if(count1 > count2){
                            answer1 += count1;
                        } else {
                            answer2 += count2;
                        }
                    }
                }
            }
        }

        bw.write(answer1 + " " + answer2 + "\n");
        bw.flush();
        bw.close();
    }
    
}