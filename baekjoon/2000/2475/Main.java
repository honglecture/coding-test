// https://www.acmicpc.net/problem/2475
// 검증수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = bf.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(array[i]);
            sum += (n * n);
        }
        int result = sum % 10;
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}