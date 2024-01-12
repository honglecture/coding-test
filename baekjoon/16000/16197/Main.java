// https://www.acmicpc.net/problem/16197
// 두 동전
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        List<int[]> list = new ArrayList<>();
        String[][] array = new String[y + 2][x + 2];
        Queue<int[]> queue = new ArrayDeque<>();
        int answer = -1;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        for (int i = 1; i < array.length - 1; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j + 1] = sArray[j];
                if(array[i][j + 1].equals("o")){
                    list.add(new int[]{i, j + 1});
                }
            }
        }
        queue.add(new int[]{list.get(0)[0], list.get(0)[1], list.get(1)[0], list.get(1)[1], 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y1 = pollArray[0];
            int x1 = pollArray[1];
            int y2 = pollArray[2];
            int x2 = pollArray[3];
            int count = pollArray[4];
            String str1 = array[y1][x1];
            String str2 = array[y2][x2];
            if(count > 10){
                continue;
            }
            if(str1 == null && str2 == null){
                continue;
            }
            
            if(str1 == null && str2 != null){
                answer = count;
                break;
            }
            if(str1 != null && str2 == null){
                answer = count;
                break;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY1 = y1 + array1[i];
                int nextX1 = x1 + array2[i];
                int nextY2 = y2 + array1[i];
                int nextX2 = x2 + array2[i];
                if(array[nextY1][nextX1] != null && array[nextY1][nextX1].equals("#")){
                    nextY1 = y1;
                    nextX1 = x1;
                }
                if(array[nextY2][nextX2] != null && array[nextY2][nextX2].equals("#")){
                    nextY2 = y2;
                    nextX2 = x2;
                }
                queue.add(new int[]{nextY1, nextX1, nextY2, nextX2, count + 1});
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}

