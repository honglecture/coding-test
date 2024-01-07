// https://www.acmicpc.net/problem/19598
// 최소 회의실 개수
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        Queue<Integer> queueTemp = new PriorityQueue<>();
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            queue.add(new int[]{n1, n2});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n1 = pollArray[0];
            int n2 = pollArray[1];
            while (queueTemp.size() != 0) {
                int n = queueTemp.peek();
                if(n1 >= n){
                    queueTemp.poll();
                } else {
                    break;
                }
            }
            queueTemp.add(n2);
            if(max < queueTemp.size()){
                max = queueTemp.size();
            }
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }
}