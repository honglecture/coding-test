// https://www.acmicpc.net/problem/16426
// Sculpture
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int[][] array = new int[y][x];
        int[][] answerArray = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                int n = array[i][j];
                boolean flag = true;
                for (int k = 0; k < array1.length; k++) {
                    int checkY = i + array1[k];
                    int checkX = j + array2[k];
                    if(array[checkY][checkX] <= n){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answerArray[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
