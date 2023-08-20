// https://www.acmicpc.net/problem/2845
// 파티가 끝나고 난 뒤
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int sum = n1 * n2;
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            bw.write(n - sum + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}