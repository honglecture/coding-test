// https://www.acmicpc.net/problem/2696
// 중앙값 구하기
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            Queue<Integer> queue = new PriorityQueue<>();
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);

            }
        }
        bw.flush();
        bw.close();
    }

}