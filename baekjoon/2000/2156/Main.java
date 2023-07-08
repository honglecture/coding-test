// https://www.acmicpc.net/problem/2156
// 포도주 시식
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        if(size == 1){
            bw.write(array[0] + "\n");
            bw.flush();
            bw.close();
            return;
        } else if(size == 2){
            bw.write((array[0] + array[1]) + "\n");
            bw.flush();
            bw.close();
            return;
        } else if(size == 3){
            Arrays.sort(array);
            bw.write((array[array.length - 1] + array[array.length - 2]) + "\n");
        }
        int result = 0;
        int[] dp = new int[size + 2];
        dp[2] = array[0];
        dp[3] = array[0] + array[1];
        for (int i = 4; i < dp.length; i++) {
            dp[i] =  Integer.max(dp[i - 4] + array[i - 3] + array[i - 2],Integer.max(dp[i - 3] + array[i - 3] + array[i - 2], dp[i - 2] + array[i - 2]));
            if(dp[i] > result){
                result = dp[i];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}