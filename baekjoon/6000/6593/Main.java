// https://www.acmicpc.net/problem/6593
// 상범 빌딩
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int l = Integer.parseInt(sArray[0]);
            int r = Integer.parseInt(sArray[1]);
            int c = Integer.parseInt(sArray[2]);
            if(l == 0 && r == 0 && c == 0){
                break;
            }
            String[][][] array = new String[l][r][c];
            int[] startArray = new int[3];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < r; j++) {
                    String[] sArray1 = bf.readLine().split("");
                    for (int k = 0; k < sArray1.length; k++) {
                        array[i][j][k] = sArray1[k];
                        if(sArray1[k].equals("S")){
                            startArray[0] = i;
                            startArray[1] = j;
                            startArray[2] = k;
                        }
                    }
                }
                bf.readLine();
            }
            int result = getAnswer(array, startArray, l, r, c);
            if(result == -1){
                bw.write("Trapped!\n");
            } else {
                bw.write("Escaped in " + result + " minute(s).\n");
            }
        }
        bw.flush();
        bw.close();
    }


    private static int getAnswer(String[][][] array, int[] startArray, int l, int r, int c){
        int answer = -1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startArray[0], startArray[1], startArray[2], 0});
        boolean[][][] visitArray = new boolean[l][r][c];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n1 = pollArray[0];
            int n2 = pollArray[1];
            int n3 = pollArray[2];
            int count = pollArray[3];
            if(visitArray[n1][n2][n3]){
                continue;
            }
            visitArray[n1][n2][n3] = true;
            if(array[n1][n2][n3].equals("#")){
                continue;
            }
            if(array[n1][n2][n3].equals("E")){
                answer = count;
                break;
            }
            
            count++;
            if(n1 + 1 <= l - 1){
                queue.add(new int[]{n1 + 1, n2, n3, count});
            }
            if(n1 -1 >= 0){
                queue.add(new int[]{n1 - 1, n2, n3, count});
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = n2 + array1[i];
                int nextX = n3 + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > r - 1 || nextX > c - 1){
                    continue;
                }
                queue.add(new int[]{n1, nextY, nextX, count});
            }
        }
        return answer;
    }

    
}