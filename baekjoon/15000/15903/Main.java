// https://www.acmicpc.net/problem/15903
// 카드 합체 놀이
import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int count = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        Queue<Long> queue = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                long n1 = o1;
                long n2 = o2;
                if(n1 < n2){
                    return -1;
                } else if(n1 == n2){
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        for (int i = 0; i < sArray.length; i++) {
            queue.add(Long.parseLong(sArray[i]));
        }

        while (true) {
            if(count == 0){
                break;
            }
            long n1 = queue.poll();
            long n2 = queue.poll();
            long n3 = n1 + n2;
            queue.add(n3);
            queue.add(n3);
            count--;
        }

        long sum = 0;
        while (queue.size() != 0) {
            sum += queue.poll();
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
    
}