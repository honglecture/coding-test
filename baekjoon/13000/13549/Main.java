// https://www.acmicpc.net/problem/13549
// 숨바꼭질 3
import java.io.*;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        boolean[] visit = new boolean[200000];
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        queue.add(new int[]{n1, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(n == n2){
                answer = count;
                break;
            }
            if(visit[n]){
                continue;
            }
            visit[n] = true;
            int nextN1 = n + 1;
            int nextN2 = n - 1;
            int nextN3 = n * 2;
            if(nextN1 >= 0 && nextN1 < visit.length){
                queue.add(new int[]{nextN1, count + 1});
            }
            if(nextN2 >= 0 && nextN2 < visit.length){
                queue.add(new int[]{nextN2, count + 1});
            }
            if(nextN3 > 0 && nextN3 < visit.length){
                queue.add(new int[]{nextN3, count});
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}