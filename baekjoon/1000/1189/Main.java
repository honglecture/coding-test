// https://www.acmicpc.net/problem/1189
// 컴백홈
import java.io.*;
public class Main {

    private static String[][] array;
    private static boolean[][] visitArray;
    private static int k;
    private static int answer = 0;
    private static int[] array1 = {-1, 0, 1, 0};
    private static int[] array2 = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        k = Integer.parseInt(sArray[2]);
        array = new String[y][x];
        visitArray = new boolean[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sArray[j];
            }
        }
        visitArray[y - 1][0] = true;
        getAnswer(y - 1, 0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int y, int x, int count){
        if(count == k - 1){
            if(y == 0 && x == array[0].length - 1){
                answer++;
            }
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            int nextY = y + array1[i];
            int nextX = x + array2[i];
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                continue;
            }
            if(visitArray[nextY][nextX]){
                continue;
            }
            if(array[nextY][nextX].equals("T")){
                continue;
            }
            visitArray[nextY][nextX] = true;
            getAnswer(nextY, nextX, count + 1);
            visitArray[nextY][nextX] = false;
        }

    }
    
}
