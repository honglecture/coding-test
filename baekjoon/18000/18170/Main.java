// https://www.acmicpc.net/problem/18170
// 두 동전 언리미티드
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String[][] array = new String[Integer.parseInt(sArray[0])][Integer.parseInt(sArray[1])];
        Set<String> set = new HashSet<>();
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int startY1 = -1;
        int startX1 = -1;
        int startY2 = -1;
        int startX2 = -1;
        int answer = -1;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("o")){
                    if(startY1 == -1){
                        startY1 = i;
                        startX1 = j;
                    } else {
                        startY2 = i;
                        startX2 = j;
                    }
                }
            }
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startY1, startX1, startY2, startX2, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int y1 = pollArray[0];
            int x1 = pollArray[1];
            int y2 = pollArray[2];
            int x2 = pollArray[3];
            int count = pollArray[4];
            String str = y1 + " " + x1 + " " + y2 + " " + x2;
           // System.out.println(str);
            if((y1 < 0 || x1 < 0 || y1 > array.length - 1 || x1 >  array[0].length - 1) 
                && (y1 < 0 || x1 < 0 || y1 > array.length - 1 || x1 >  array[0].length - 1)){
                continue;
            }
            if((y1 >= 0 && x1 >= 0 && y1 <= array.length - 1 && x1 <=  array[0].length - 1) 
                && (y1 >=  0 && x1 >=  0 && y1 <= array.length - 1 && x1 <=  array[0].length - 1)){
            } else {
                answer = count;
                break;
            }
            String tile1 = array[y1][x1];
            String tile2 = array[y2][x2];
            if(set.contains(str)){
                continue;
            }
            if(tile1.equals("#") || tile2.equals("#")){
                continue;
            }
            if(y1 == y2 && x1 == x2){
                continue;
            }
            set.add(str);
            for (int i = 0; i < array1.length; i++) {
                int nextY1 = y1 + array1[i];
                int nextX1 = x1 + array2[i];
                int nextY2 = y2 + array1[i];
                int nextX2 = x2 + array2[i];
                queue.add(new int[]{nextY1, nextX1, nextY2, nextX2, count + 1});
            }
        }
        System.out.println(answer);
        System.out.println(set);
        bw.flush();
        bw.close();
    }

}
