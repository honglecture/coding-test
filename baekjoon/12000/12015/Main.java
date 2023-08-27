// https://www.acmicpc.net/problem/12015
// 가장 긴 증가하는 부분 수열 2
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] dp = new int[size + 1];
        int dpIndex = 1;
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            if(dp[dpIndex - 1] < n){
                dp[dpIndex++] = array[i];
            } else {
                change(dp, array, n, dpIndex - 1);
            }
        }
        bw.write(dpIndex + "\n");
        for (int i = 0; i < dp.length; i++) {
            bw.write(dp[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        // 10 20 30 15 20 30 50 40 45 60
    }
    private static void change(int[] dp, int[] array, int n, int endIndex){
        int start = 0;
        int end = endIndex;
        int resultIndex = -1;
        int currentNum = Integer.MAX_VALUE;
        while(true){
            if(start > end){
                break;
            }
            int mid = (start + end) / 2;
            int nextNum = dp[mid];
            if(nextNum < n){
                start = mid + 1;
            } else {
                if(currentNum > nextNum){
                    currentNum = nextNum;
                    resultIndex = mid;
                }
                end = mid - 1;
            }
        }
        dp[resultIndex] = n;
    }
}
