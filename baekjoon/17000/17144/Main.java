// https://www.acmicpc.net/problem/17144
// 미세먼지 안녕!
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int sec = Integer.parseInt(sArray[2]);
        int[][] array = new int[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int[][] airArray = new int[2][2];
        int airIndex = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == -1){
                    airArray[airIndex][0] = i;
                    airArray[airIndex][1] = j;
                    airIndex++;
                }
            }
        }
        while(sec != 0){
            sec--;
            // 확산
            int[][] sumArray = new int[array.length][array[0].length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int n = array[i][j];
                    if(n < 5){
                        continue;
                    }
                    int result = n / 5;
                    int count = 0;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = i + array1[k];
                        int nextX = j + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length -1){
                            continue;
                        }
                        if(array[nextY][nextX] == -1){
                            continue;
                        }
                        sumArray[nextY][nextX] += result;
                        count++;
                    }
                    sumArray[i][j] += -(result * count);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[i][j] + sumArray[i][j];
                }
            }
            System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
            // 돌려
            int startY = airArray[0][0];
            int startX = airArray[0][1] + 1;
            setAir1(array, startY, startX);
            startY = airArray[1][0];
            startX = airArray[1][1] + 1;
            setAir2(array, startY, startX);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != -1){
                    sum += array[i][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

    private static void setAir1(int[][] array, int startY, int startX){
        int currentNum = array[startY][startX];
        array[startY][startX] = 0;
        for (int i = startX + 1; i < array[0].length; i++) {
            int nextNum = array[startY][i];
            array[startY][i] = currentNum;
            currentNum = nextNum;
        }
        for (int i = startY - 1; i >= 0; i--) {
            int nextNum = array[i][array[0].length - 1];
            array[i][array[0].length - 1] = currentNum;
            currentNum = nextNum;
        }
        for (int i = array[0].length - 2; i >= 0; i--) {
            int nextNum = array[0][i];
            array[0][i] = currentNum;
            currentNum = nextNum;
        }
        for (int i = 1; i <= startY - 1; i++) {
            int nextNum = array[i][0];
            array[i][0] = currentNum;
            currentNum = nextNum;
        }
    }
    private static void setAir2(int[][] array, int startY, int startX){
        int currentNum = array[startY][startX];
        array[startY][startX] = 0;
        for (int i = startX + 1; i < array[0].length; i++) {
            int nextNum = array[startY][i];
            array[startY][i] = currentNum;
            currentNum = nextNum;
        }
        for (int i = startY + 1; i < array.length; i++) {
            int nextNum = array[i][array[0].length - 1];
            array[i][array[0].length - 1] = currentNum;
            currentNum = nextNum;
        }
        for (int i = array[0].length - 2; i >= 0; i--) {
            int nextNum = array[array.length - 1][i];
            array[array.length - 1][i] = currentNum;
            currentNum = nextNum;
        }
        for (int i = array.length - 2; i >= startY + 1; i--) {
            int nextNum = array[i][0];
            array[i][0] = currentNum;
            currentNum = nextNum;
        }
    }

}
