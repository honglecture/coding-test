// https://www.acmicpc.net/problem/10844
// 쉬운 계단 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[][] array = new int[101][10];
        if(n == 1){
            bw.write("9" + "\n");
            bw.flush();
            bw.close();
            return;
        }
        
        for (int i = 2; i <= 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int count = 0;
                if(j == 0 || j == 9){
                    count = array[i - 1][j] + 1;
                } else {
                    count = array[i - 1][j] + 2;
                }
                if(i == 2){
                    array[2][1] = 1;
                }
                array[i][j] = count;
            }
        }
        for (int i = 3; i <= 100; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j == 0){
                    array[i][0] = array[i - 1][1];
                } else if(j == 9){
                    array[i][9] = array[i - 1][8];
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
                }
                array[i][j] = array[i][j] % 1000000000;
            }
        }
        long sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum += array[n][i];
            
        }
        sum = sum  % 1000000000;
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}