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
        l = Integer.parseInt(sArray[1]);
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
        int startIndex = 1;
        boolean[] visitArray = new boolean[subArray.length];
        for (int i = 0; i < subArray.length - 1; i++) {
            int n1 = subArray[i];
            int n2 = subArray[i + 1];
            if(Math.abs(n1 - n2) > 1){
                result = 0;
                break;
            }
        }
        if(result == 0){
            return result;
        }
        while(true){
            if(startIndex >= subArray.length){
                break;
            }
            int n1 = subArray[startIndex];
            int n2 = subArray[startIndex - 1];
            if(n1 != n2){
                if(n1 < n2){
                    if(startIndex - 1 + l > subArray.length - 1){
                        result = 0;
                        break;
                    }
                    // 내리막
                    for (int i = startIndex; i < startIndex + l; i++) {
                        if(n1 != subArray[i]){
                            result = 0;
                            break;
                        }
                        visitArray[i] = true;
                    }
                    startIndex += l;
                } else if(n1 > n2){
                    if(startIndex - l < 0){
                        result = 0;
                        break;
                    }
                    // 오르막
                    for (int i = startIndex - 1; i > startIndex - 1 - l; i--) {
                        if(visitArray[i]){
                            result = 0;
                            break;
                        }
                        if(n2 != subArray[i]){
                            result = 0;
                            break;
                        }
                        visitArray[i] = true;
                    }
                    startIndex++;
                }
            } else {
                startIndex++;
            }
            if(result == 0){
                break;
            }
        }
        return result;
    }

    
}