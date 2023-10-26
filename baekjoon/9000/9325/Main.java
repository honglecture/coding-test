// https://www.acmicpc.net/problem/9325
// 얼마? 
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int m = Integer.parseInt(bf.readLine());
            int size = Integer.parseInt(bf.readLine());
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                m += (n1 * n2);
            }
            bw.write(m + "\n");
        }
        bw.flush();
        bw.close();
    }
}