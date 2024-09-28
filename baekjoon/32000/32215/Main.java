// https://www.acmicpc.net/problem/32215
// 코드마스터 2024
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        int sum = m * k;
        bw.flush();
        bw.close();
    }


}
