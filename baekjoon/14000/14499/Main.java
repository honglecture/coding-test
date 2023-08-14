// https://www.acmicpc.net/problem/14499
// 주사위 굴리기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = {0, 0, 0, -1, 1};
        int[] array2 = {0, 1, -1, 0, 0};
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int startY = Integer.parseInt(sArray[2]);
        int startX = Integer.parseInt(sArray[3]);
        int startN = 1;
        int size = Integer.parseInt(sArray[4]);
        int[] diceArray = new int[7];
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            int nextY = startY + array1[n];
            int nextX = startX + array2[n];
            int nextN = 0;
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                continue;
            }
            int num = array[nextY][nextX];
            if(n == 1){
                if(startN == 1){
                    array[nextY][nextX] = diceArray[3];
                    diceArray[3] = num;
                    nextN = 4;
                } else if(startN == 2){
                    array[nextY][nextX] = diceArray[3];
                    diceArray[3] = num;
                    nextN = 4;
                } else if(startN == 3){
                    array[nextY][nextX] = diceArray[6];
                    diceArray[6] = num;
                    nextN = 1;
                } else if(startN == 4){
                    array[nextY][nextX] = diceArray[1];
                    diceArray[1] = num;
                    nextN = 3;
                } else if(startN == 5){
                    array[nextY][nextX] = diceArray[3];
                    diceArray[3] = num;
                    nextN = 4;
                } else if(startN == 6){
                    array[nextY][nextX] = diceArray[3];
                    diceArray[3] = num;
                    nextN = 4;
                }
            } else if(n == 2){
                if(startN == 1){
                    array[nextY][nextX] = diceArray[4];
                    diceArray[4] = num;
                    nextN = 3;
                } else if(startN == 2){
                    array[nextY][nextX] = diceArray[4];
                    diceArray[4] = num;
                    nextN = 3;
                } else if(startN == 3){
                    array[nextY][nextX] = diceArray[1];
                    diceArray[1] = num;
                    nextN = 6;
                } else if(startN == 4){
                    array[nextY][nextX] = diceArray[3];
                    diceArray[3] = num;
                    nextN = 1;
                } else if(startN == 5){
                    array[nextY][nextX] = diceArray[4];
                    diceArray[4] = num;
                    nextN = 3;
                } else if(startN == 6){
                    array[nextY][nextX] = diceArray[4];
                    diceArray[4] = num;
                    nextN = 3;
                }
            } else if(n == 3){
                if(startN == 1){
                    array[nextY][nextX] = diceArray[2];
                    diceArray[2] = num;
                    nextN = 5;
                } else if(startN == 2){
                    array[nextY][nextX] = diceArray[6];
                    diceArray[6] = num;
                    nextN = 1;
                } else if(startN == 3){
                    array[nextY][nextX] = diceArray[2];
                    diceArray[2] = num;
                    nextN = 5;
                } else if(startN == 4){
                    array[nextY][nextX] = diceArray[2];
                    diceArray[2] = num;
                    nextN = 5;
                } else if(startN == 5){
                    array[nextY][nextX] = diceArray[1];
                    diceArray[1] = num;
                    nextN = 6;
                } else if(startN == 6){
                    array[nextY][nextX] = diceArray[5];
                    diceArray[5] = num;
                    nextN = 2;
                }
            } else {
                if(startN == 1){
                    array[nextY][nextX] = diceArray[5];
                    diceArray[5] = num;
                    nextN = 2;
                } else if(startN == 2){
                    array[nextY][nextX] = diceArray[1];
                    diceArray[1] = num;
                    nextN = 6;
                } else if(startN == 3){
                    array[nextY][nextX] = diceArray[5];
                    diceArray[5] = num;
                    nextN = 2;
                } else if(startN == 4){
                    array[nextY][nextX] = diceArray[5];
                    diceArray[5] = num;
                    nextN = 2;
                } else if(startN == 5){
                    array[nextY][nextX] = diceArray[6];
                    diceArray[6] = num;
                    nextN = 1;
                } else if(startN == 6){
                    array[nextY][nextX] = diceArray[2];
                    diceArray[2] = num;
                    nextN = 5;
                }
            }
            bw.write(diceArray[nextN] + "\n");
            startY = nextY;
            startX = nextX;
            startN = nextN;
        }
        for (int i = 0; i < diceArray.length; i++) {
            System.out.print(diceArray[i]);
        }
        System.out.println();
        bw.flush();
        bw.close();
    }


}