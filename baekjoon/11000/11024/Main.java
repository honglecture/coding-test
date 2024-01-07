// https://www.acmicpc.net/problem/11024
// 더하기 4
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
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