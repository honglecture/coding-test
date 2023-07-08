// https://www.acmicpc.net/problem/1912
// 연속합

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array =  new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int result = dp[0];
        for (int i = 1; i < array.length; i++) {
            int beforeNum = dp[i - 1];
            int currentNum = array[i];
            if(beforeNum + currentNum > currentNum){
                dp[i] = beforeNum + currentNum;
            } else {
                dp[i] = currentNum;
            }
            if(result < dp[i]){
                result = dp[i];
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
