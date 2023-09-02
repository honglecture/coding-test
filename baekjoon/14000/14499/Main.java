// https://www.acmicpc.net/problem/14499
// 주사위 굴리기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[] array1 = {0, 0, 0, -1, 1};
        int[] array2 = {0, 1, -1, 0, 0};
        int startY = Integer.parseInt(sArray[2]);
        int startX = Integer.parseInt(sArray[3]);
        int frontIndex = 3; // 윗면 
        int backIndex = 6; // 뒷면
        int[] diceArray = {0, 0, 0, 0, 0, 0, 0};
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            int order = Integer.parseInt(sArray[i]);
            // 동쪽은 1, 서쪽은 2, 북쪽은 3, 남쪽은 4
            int nextY = startY + array1[order];
            int nextX = startX + array2[order];
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                continue;
            }
            int temp = diceArray[frontIndex];
            if(order == 1){
                diceArray[3] = diceArray[4];
                diceArray[4] = diceArray[6];
                diceArray[6] = diceArray[2];
                diceArray[2] = temp;
            } else if(order == 2){
                diceArray[3] = diceArray[2];
                diceArray[2] = diceArray[6];
                diceArray[6] = diceArray[4];
                diceArray[4] = temp;
            } else if(order == 3){
                diceArray[3] = diceArray[5];
                diceArray[5] = diceArray[6];
                diceArray[6] = diceArray[1];
                diceArray[1] = temp;
            } else if(order == 4){
                diceArray[3] = diceArray[1];
                diceArray[1] = diceArray[6];
                diceArray[6] = diceArray[5];
                diceArray[5] = temp;
            }
            if(array[nextY][nextX] == 0){
                array[nextY][nextX] = diceArray[backIndex];
            } else {
                diceArray[backIndex] = array[nextY][nextX];
                array[nextY][nextX] = 0;
            }
            startY = nextY;
            startX = nextX;
            bw.write(diceArray[frontIndex] + "\n");
        }
        bw.flush();
        bw.close();
    }


}