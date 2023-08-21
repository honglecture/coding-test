// https://www.acmicpc.net/problem/2565
// 전깃줄
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i][1];
            int count = dp[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j][1];
                if(n1 < n2){
                    dp[j] = Integer.max(count + 1, dp[j]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max){
                max = dp[i];
            }
        }
        bw.write(array.length - max -1 + "\n");
        bw.flush();
        bw.close();
    }
}