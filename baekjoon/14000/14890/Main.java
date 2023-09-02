// https://www.acmicpc.net/problem/14890
// 경사로
import java.io.*;
public class Main {

    private static int[][] array;
    private static int l;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int[][] array = new int[size][size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int[] subArray = new int[size];
            for (int j = 0; j < array.length; j++) {
                subArray[j] = array[i][j];
            }
            int result = getAnswer(subArray);
            count += result;
        }
        for (int i = 0; i < array.length; i++) {
            int[] subArray = new int[size];
            for (int j = 0; j < array.length; j++) {
                subArray[j] = array[j][i];
            }
            int result = getAnswer(subArray);
            count += result;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] subArray){
        int result = 1;
        int startIndex = 0;
        while(true){
            int currentNum = subArray[startIndex];
            int nextNum = subArray[startIndex + 1];
            if(currentNum == nextNum){
                startIndex++;
            } else {
                int absNum = Math.abs(currentNum - nextNum);
                if(absNum > 1){
                    result = 0;
                    break;
                }
                
            }
        }
        return result;
    }

    
}