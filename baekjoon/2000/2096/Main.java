// https://www.acmicpc.net/problem/2096
// 내려가기
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
        int[][] dp1 = new int[size][3];
        int[][] dp2 = new int[size][3];
        int[][] array = new int[size][3];
        for (int i = 0; i < array.length; i++) {
           sArray = bf.readLine().split(" ");
           for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
           }
        }
        dp1[0][0] = dp2[0][0] = array[0][0];
        dp1[0][1] = dp2[0][1] = array[0][1];
        dp1[0][2] = dp2[0][2] = array[0][2];
        for (int i = 1; i < dp1.length; i++) {
            int max = Integer.max(dp1[i - 1][0], Integer.max(dp1[i - 1][1], dp1[i - 1][2]));
            dp1[i][0] = Integer.max(dp1[i - 1][0] + array[i][0] , dp1[i - 1][1] + array[i][0]);
            dp1[i][1] = array[i][1] + max;
            dp1[i][2] = Integer.max(dp1[i - 1][2] + array[i][2] , dp1[i - 1][1] + array[i][2]);
            int min = Integer.min(dp2[i - 1][0], Integer.min(dp2[i - 1][1], dp2[i - 1][2]));
            dp2[i][0] = Integer.min(dp2[i - 1][0] + array[i][0] , dp2[i - 1][1] + array[i][0]);
            dp2[i][1] = array[i][1] + min;
            dp2[i][2] = Integer.min(dp2[i - 1][2] + array[i][2] , dp2[i - 1][1] + array[i][2]);
        }
        bw.write(Integer.max(dp1[dp1.length - 1][0], Integer.max(dp1[dp1.length - 1][1], dp1[dp1.length - 1][2])) + " ");
        bw.write(Integer.min(dp2[dp2.length - 1][0], Integer.min(dp2[dp2.length - 1][1], dp2[dp2.length - 1][2])) + "\n");
        bw.flush();
        bw.close();
    }

}