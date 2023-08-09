// https://www.acmicpc.net/problem/1806
// 부분합

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
        int answer = 0;
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int[] dp = new int[size + 1];
        boolean flag = false;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(array[i] >= n){
                flag = true;
                break;
            }
            dp[i + 1] = dp[i] + array[i];
        }
        if(flag){
            answer = 1;
        }else if(dp[size] < n){
            answer = 0;
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < dp.length; i++) {
                for (int j = i + 1; j < dp.length; j++) {
                    int result = dp[j] - dp[i - 1];
                    if(n <= result){
                        if(j - i + 1 < min){
                            min = j - i + 1;
                        }
                        break;
                    }
                }
            }
            answer = min;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
