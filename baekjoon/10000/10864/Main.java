// https://www.acmicpc.net/problem/10864
// 친구
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m  = Integer.parseInt(sArray[1]);
        int[] array = new int[n + 1];
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[n1]++;
            array[n2]++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(array[i]);
        }
        bw.flush();
        bw.close();
    }
}