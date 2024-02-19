// https://www.acmicpc.net/problem/1531
// 투명
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n = Integer.parseInt(sArray[1]);
        int[][] array = new int[100][100];
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int x1 = Integer.parseInt(sArray[0]) - 1;
            int y1 = Integer.parseInt(sArray[1]) - 1;
            int x2 = Integer.parseInt(sArray[2]) - 1;
            int y2 = Integer.parseInt(sArray[3]) - 1;
            for (int j = y1; j <= y2; j++) {
                for (int k = x1; k <= x2; k++) {
                    array[j][k]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] > n){
                    count++;
                }
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
