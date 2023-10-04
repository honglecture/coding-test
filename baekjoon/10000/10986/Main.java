// https://www.acmicpc.net/problem/10986
// 나머지 합
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        int[] dp = new int[size + 1];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            dp[i + 1] = dp[i] + array[i];
        }
        int count = 0;
        int n = 1;
        while(true){
            if(n >= dp.length){
                break;
            }
            for (int i = n; i < dp.length; i++) {
                int result = dp[i] - dp[i - n];
                if(result % key == 0){
                    count++;
                }
            }
            n++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}