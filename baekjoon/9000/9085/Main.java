// https://www.acmicpc.net/problem/9085
// 더하기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < sArray.length; j++) {
                sum += Integer.parseInt(sArray[j]);
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}