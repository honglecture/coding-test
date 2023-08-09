// https://www.acmicpc.net/problem/11722
// 가장 긴 감소하는 부분 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        int[] dp = new int[size];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(i + " " + j);
                if(array[i] > array[j]){
                    dp[j] = Integer.max(dp[j], dp[i] + 1);
                } else if(array[i] == array[j]){
                    dp[j] = dp[i];
                    break;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]);
           if(max < dp[i]){
                max = dp[i];
           }
        }
        System.out.println();
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}
