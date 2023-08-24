// https://www.acmicpc.net/problem/1655
// 가운데를 말해요
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = o1;
                int n2 = o2;
                return n2 - n1;
            }
        });
        bw.write("\n");
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            queue.add(n);
            bw.write(queue.peek() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
