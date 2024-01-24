// https://www.acmicpc.net/problem/10994
// 별 찍기 - 19
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int n = size * 4 - 3;
        String[][] array = new String[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " ";
            }
        }
        int count = size;
        int startY = 0;
        int startX = 0;
        while (true) {
            if(count == 0){
                break;
            }
            for (int i = startY; i < startY + n; i++) {
                array[startY][i] = "*";
            }
            for (int i = startY; i < startY + n; i++) {
                array[i][startY] = "*";
            }
            for (int i = startY; i < startY + n; i++) {
                array[array.length - 1 -  startY][i] = "*";
            }
            for (int i = startY; i < startY + n; i++) {
                array[i][array.length - 1 - startY] = "*";
            }
            startY += 2;
            startX += 2;
            count--;
            n -= 4;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}