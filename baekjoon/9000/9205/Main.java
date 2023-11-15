// https://www.acmicpc.net/problem/9205
// 맥주 마시면서 걸어가기
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[][] array = new int[size + 2][2];
            for (int j = 0; j < array.length; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                array[j][0] = n1;
                array[j][1] = n2;
            }

            boolean[] visitArray = new boolean[size + 2];
            int startX = array[0][0];
            int startY = array[0][1];
            int endX = array[array.length - 1][0];
            int endY = array[array.length - 1][1];
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{startX, startY, 0});
            boolean flag = false;
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int currentX = pollArray[0];
                int currentY = pollArray[1];
                int index = pollArray[2];
                if(index == array.length - 1){
                    flag = true;
                    break;
                }
                if(visitArray[index]){
                    continue;
                }
                visitArray[index] = true;
                for (int j = 0; j < visitArray.length; j++) {
                    if(!visitArray[j]){
                        int nextX = Math.abs(array[j][0] - currentX);
                        int nextY = Math.abs(array[j][1] - currentY);
                        int nextIndex = j;
                        if(nextX + nextY <= 1000){
                            queue.add(new int[]{array[j][0], array[j][1], nextIndex});
                        }
                    }
                }
            }
            if(flag){
                bw.write("happy\n");
            } else {
                bw.write("sad\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
