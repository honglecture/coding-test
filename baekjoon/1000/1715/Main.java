// https://www.acmicpc.net/problem/1715
// 카드 정렬하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < size; i++) {
            queue.add(Integer.parseInt(bf.readLine()));
        }
        long sum = 0;
        while(queue.size() != 1){
            int n1 = queue.poll();
            int n2 = queue.poll();
            sum += n1 + n2;
            queue.add(n1 + n2);
        }
        if(size == 1){
            sum = 0;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();

    }


}
