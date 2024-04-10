// https://www.acmicpc.net/problem/23880
// Walking Home
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        int[] array1 = {0, 1};
        int[] array2 = {1, 0};
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int n = Integer.parseInt(sArray[1]);
            String[][] array = new String[size][size];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k];
                }
            }
            int answer = 0;
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{0, 1, 0, 0});
            queue.add(new int[]{1, 0, 1, 0});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int y = pollArray[0];
                int x = pollArray[1];
                int d = pollArray[2];
                int count = pollArray[3];
                if(array[y][x].equals("H")){
                    continue;
                }
                if(count > n){
                    continue;
                }
                if(y == size - 1 && x == size - 1){
                    if(count <= n){
                        answer++;
                    }
                    continue;
                }
                for (int j = 0; j < array1.length; j++) {
                    int nextY = y + array1[j];
                    int nextX = x + array2[j];
                    if(nextY > size - 1 || nextX > size - 1){
                        continue;
                    }
                    if(j == 0 && d == 1){
                        queue.add(new int[]{nextY, nextX, j, count + 1});
                    } else if(j == 1 && d == 0){
                        queue.add(new int[]{nextY, nextX, j, count + 1});
                    } else {
                        queue.add(new int[]{nextY, nextX, j, count});
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
