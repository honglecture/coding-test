// https://www.acmicpc.net/problem/11054
// 가장 긴 바이토닉 부분 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] ldp = new int[size];
        int[] rdp = new int[size];
        int[] dp = new int[10001];
        for (int i = 0; i < ldp.length; i++) {
            ldp[i] = 1;
            rdp[i] = 1;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            int count = ldp[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j];
                if(n2 > n1){
                    ldp[j] = count + 1;
                    dp[n1] = ldp[j];
                } else  {
                    ldp[j] = dp[n1];
                    break;
                }
            }
        }
        dp = new int[10001];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int n1 = array[i];
            int count = rdp[i];
            for (int j = i - 1; j >= 0; j--) {
                int n2 = array[j];
                if(n2 > n1){
                    rdp[j] = count + 1;
                    dp[n1] = rdp[j];
                } else  {
                    rdp[j] = dp[n1];
                    break;
                }
            }
        }
        for (int i = 0; i < ldp.length; i++) {
            int sum = ldp[i] + rdp[i];
            if(answer < sum){
                answer = sum;
            }
        }
        for (int i = 0; i < ldp.length; i++) {
            System.out.print(ldp[i]);
        }
        System.out.println();
        for (int i = 0; i < rdp.length; i++) {
            System.out.print(rdp[i]);
        }
        System.out.println();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
