// https://www.acmicpc.net/problem/9184
// 신나는 함수 실행
import java.io.*;
public class Main {

    private static int[][][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp = new int[51][51][51];
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int a = Integer.parseInt(sArray[0]);
            int b = Integer.parseInt(sArray[1]);
            int c = Integer.parseInt(sArray[2]);
            if(a == -1 && b == -1 && c == -1){
                break;
            }
            int result = w(a,b,c);
            String str = "w(" + a + ", " + b + ", " + c + ") = " + result;
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int w(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return 1;
        } 
        if(dp[a][b][c] != 0){
            return dp[a][b][c];
        };
        if(a > 20 || b > 20 || c > 20){
            return dp[20][20][20] = w(20, 20, 20);
        } else if(a < b && b < c){
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        } else {
            return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }
    }   


}