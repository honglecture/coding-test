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
        Queue<int[]> minQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Queue<int[]> maxQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        if(size == 1){
            System.out.println("1");
            return;
        }
        int n = Integer.parseInt(bf.readLine());
        maxQueue.add(new int[]{n, 1});
        bw.write(n + "\n");
        for (int i = 2; i <= size; i++) {
            n = Integer.parseInt(bf.readLine());
            if(i == 2){
                minQueue.add(new int[]{n, i});
            } else {
                if(maxQueue.size() == minQueue.size()){
                    maxQueue.add(new int[]{n, i});
                } else {
                    minQueue.add(new int[]{n, i});
                }
            }
            if(maxQueue.peek()[0] > minQueue.peek()[0]){
                int[] temp = maxQueue.poll();
                maxQueue.add(minQueue.poll());
                minQueue.add(temp);
            }
            bw.write(maxQueue.peek()[0] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
