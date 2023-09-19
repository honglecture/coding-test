// https://www.acmicpc.net/problem/2161
// 카드1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while(queue.size() != 0){
            int num = queue.poll();
            sb.append(num + " ");
            if(queue.size() == 0){
                break;
            }
            num = queue.poll();
            queue.add(num);
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}