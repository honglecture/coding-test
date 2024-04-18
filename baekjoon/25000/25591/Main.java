// https://www.acmicpc.net/problem/25591
// 푸앙이와 종윤이
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int a = 100 - n1;
        int b = 100 - n2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        int result1 = c + q;
        int result2 = r;
        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");
        bw.write(result1 + " " + result2 + "\n");
        bw.flush();
        bw.close();
    }

    
}
