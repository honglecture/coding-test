// https://www.acmicpc.net/problem/1357
// 뒤집힌 덧셈
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
        int s1 = Integer.parseInt(sArray[0]);
        int s2 = Integer.parseInt(sArray[1]);
        int s3 = reverse(s1) +  reverse(s2);
        bw.write(reverse(s3) + "\n");
        bw.flush();
        bw.close();
    }

    private static int reverse(int n){
        StringBuilder sb = new StringBuilder(n + "");
        return Integer.parseInt(sb.reverse().toString());
    }
   

}