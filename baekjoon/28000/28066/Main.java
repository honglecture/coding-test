// https://www.acmicpc.net/problem/28066
// 타노스는 요세푸스가 밉다
import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        Queue<Integer> queue = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (true) {
            int first = queue.poll();
            if(queue.size() >= k){
                for (int i = 0; i < k; i++) {
                    queue.poll();
                }
            }
            
        }
        bw.flush();
        bw.close();
    }

  
}
