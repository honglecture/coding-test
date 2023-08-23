// https://www.acmicpc.net/problem/2953
// 나는 요리사다
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[5][4];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[] sumArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sumArray[i] = sum;
        }
        int maxIndex = 0;
        int maxNum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if(maxNum < sumArray[i]){
                maxNum = sumArray[i];
                maxIndex = i;
            }
        }
        bw.write(maxIndex + 1 + " " + maxNum + "\n");
        bw.flush();
        bw.close();
    }
}