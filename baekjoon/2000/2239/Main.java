// https://www.acmicpc.net/problem/2239
// 스도쿠
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static boolean[][] visitArray;
    private static int[][] array;
    private static boolean answerFlag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new int[10][10];
        visitArray = new boolean[10][10];
        for (int i = 1; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                array[i][j + 1] = n;
                if(n != 0){
                    visitArray[i][j + 1] = true;
                }
            }
        }
        getAnswer(1);
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index){
        if(index == 10){
            for (int i = 1; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    System.out.print(array[i][j] + "");
                }
                System.out.println();
            }
            System.out.println();
            if(isAnswer(array)){
                answerFlag = true;
            }
            return;
        }
        if(answerFlag){
            return;
        }
        boolean flag = true;
        for (int i = index; i < visitArray.length; i++) {
            for (int j = 1; j < visitArray.length; j++) {
                if(!visitArray[i][j]){
                    visitArray[i][j] = true;
                    array[i][j] = j;
                    getAnswer(index);
                    visitArray[i][j] = false;
                    array[i][j] = 0;
                    flag = false;
                }
            }
        }
        if(flag){
            getAnswer(index + 1);
        }
    }

    private static boolean isAnswer(int[][] array){
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            boolean[] checkArray1 = new boolean[10];
            boolean[] checkArray2 = new boolean[10];
            for (int j = 1; j < array.length; j++) {
                int n1 = array[i][j];
                int n2 = array[j][i];
                if(checkArray1[n1]){
                    return false;
                }
                if(checkArray2[n2]){
                    return false;
                }
                checkArray1[n1] = true;
                checkArray2[n2] = true;
            }
        }
        for (int i = 1; i < array.length; i += 3) {
            for (int j = 1; j < array.length; j += 3) {
                boolean[] checkArray = new boolean[10];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        int n = array[k][l];
                        if(checkArray[n]){
                            return false;
                        }
                        checkArray[n] = true;
                    }
                }
            }
        }

        return result;
    }
}