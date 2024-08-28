// https://www.acmicpc.net/problem/5976
// A spiral walk
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
        int[][] array = new int[size][size];
        int start = 1;
        int mode = 0;
        int[] array1 = {0, 1, 0, -1};
        int[] array2 = {1, 0, -1, 0};
        int currentY = 0;
        int currentX = 0;
        if(size == 1){
            System.out.println("1");
            return;
        }
        while (true) {
            array[currentY][currentX] = start++;
            int nextY = currentY + array1[mode];
            int nextX = currentX + array2[mode];
            if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1 || array[nextY][nextX] != 0){
                mode++;
                if(mode == 4){
                    mode = 0;
                }
                currentY = currentY + array1[mode];
                currentX = currentX + array2[mode];
                if(array[currentY][currentX] != 0){
                    break;
                }
                continue;
            }
            currentY = nextY;
            currentX = nextX;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}