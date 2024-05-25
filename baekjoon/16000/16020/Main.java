// https://www.acmicpc.net/problem/16020
// Sunflowers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        while (true) {
            if(checkAnswer(array)){
                break;
            }
            int[][] nextArray = new int[size][size];
            for (int i = 0; i < array[0].length; i++) {
                for (int j = array.length - 1; j >= 0; j--) {
                    nextArray[i][array.length - 1 - j] = array[j][i];
                }
            }
            array = new int[size][size];
            for (int i = 0; i < nextArray.length; i++) {
                for (int j = 0; j < nextArray[i].length; j++) {
                    array[i][j] = nextArray[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static boolean checkAnswer(int[][] array){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if(array[i][j] > array[i][j + 1]){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
