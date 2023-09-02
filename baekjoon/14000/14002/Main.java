// https://www.acmicpc.net/problem/14002
// 가장 긴 증가하는 부분 수열 4
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        int[] dp = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            dp[i] = 1;
        }
        for (int i = 0; i < dp.length - 1; i++) {
            for (int j = i + 1; j < dp.length; j++) {
                if(array[i] < array[j]){
                    dp[j] = Integer.max(dp[j], dp[i] + 1);
                }
            }
        }
        int maxNum = 0;
        int maxIndex = 0;
        String answer = "";
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > maxNum){
                maxNum = dp[i];
                maxIndex = i;
            }
        }
        int maxAnswer = maxNum;
        for (int i = maxIndex; i >= 0; i--) {
            if(dp[i] == maxNum){
                answer = array[i] +  " " + answer;
                maxNum--;
            }
        }
        bw.write(maxAnswer + "\n");
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}