// https://www.acmicpc.net/problem/15784
// 질투진서
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]) - 1;
        int x = Integer.parseInt(sArray[2]) - 1;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int keyNum = array[y][x];
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            int num = array[i][x];
            if(num > keyNum){
                flag = false;
                break;
            }
        }
        if(flag){
            for (int i = 0; i < array.length; i++) {
                int num = array[y][i];
                if(num > keyNum){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("HAPPY");
        } else {
            System.out.println("ANGRY");
        }
        bw.flush();
        bw.close();
    }

    
}