// https://www.acmicpc.net/problem/3980
// 선발 명단
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static int[][] array;
    private static int[] visitArray;
    private static boolean[] flagArray;
    private static int maxNum;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            array = new int[11][11];
            visitArray = new int[11];
            for (int j = 0; j < visitArray.length; j++) {
                visitArray[j] = -1;
            }
            flagArray = new boolean[11];
            maxNum = Integer.MIN_VALUE;
            for (int j = 0; j < array.length; j++) {
                String[] sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = Integer.parseInt(sArray[k]);
                }
            }
            getAnswer(0, 0);
            bw.write(maxNum + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == 11){
            int sum = 0;
            for (int i = 0; i < visitArray.length; i++) {
                sum += array[i][visitArray[i]];
            }
            if(maxNum < sum){
                maxNum = sum;
            }
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(array[index][i] != 0){
                if(!flagArray[i]){
                    visitArray[index] = i;
                    flagArray[i] = true;
                    getAnswer(count + 1, index + 1);
                    visitArray[index] = -1;
                    flagArray[i] = false;
                }
                
            }
        }
    }
}

