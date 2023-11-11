// https://www.acmicpc.net/problem/1913
// 달팽이
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int currentType = 2;
        int currentNum = size * size;
        int y = -1;
        int x = 0;
        while (true) {
            if(currentNum == 0){
                break;
            }
            int tempY = y + array1[currentType];
            int tempX = x + array2[currentType];
            if(currentType == 0){
                if(tempY < 0 || tempX < 0 || tempY > array.length - 1 || tempX > array[0].length - 1 || array[tempY][tempX] != 0){
                    currentType = 1;
                    continue;
                }
            } else if(currentType == 1){
                if(tempY < 0 || tempX < 0 || tempY > array.length - 1 || tempX > array[0].length - 1 || array[tempY][tempX] != 0){
                    currentType = 2;
                    continue;
                }
            } else if(currentType == 2){
                if(tempY < 0 || tempX < 0 || tempY > array.length - 1 || tempX > array[0].length - 1 || array[tempY][tempX] != 0){
                    currentType = 3;
                    continue;
                }
            } else if(currentType == 3){
                if(tempY < 0 || tempX < 0 || tempY > array.length - 1 || tempX > array[0].length - 1 || array[tempY][tempX] != 0){
                    currentType = 0;
                    continue;
                }
            }
            y = tempY;
            x = tempX;
            array[y][x] = currentNum;
            currentNum--;
        }
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == answer){
                    str = (i + 1) + " " + (j + 1);
                }
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write(str + "\n");

        bw.flush();
        bw.close();
    }
}
