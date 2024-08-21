// https://www.acmicpc.net/problem/5753
// Pascal Library
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            if(x == 0 && y == 0){
                break;
            }
            int[][] array = new int[y][x];
            for (int i = 0; i < array.length; i++) {
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = Integer.parseInt(sArray[j]);
                }
            }
            boolean flag = false;
            for (int i = 0; i < array[0].length; i++) {
                boolean innerFlag = true;
                for (int j = 0; j < array.length; j++) {
                    if(array[j][i] == 0){
                        innerFlag = false;
                        break;
                    }
                }
                if(innerFlag){
                    flag = true;
                    break;
                }
            }
            if(flag){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}