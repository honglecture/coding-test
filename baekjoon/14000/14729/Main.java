// https://www.acmicpc.net/problem/14729
// 칠무해
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            double n = Double.parseDouble(bf.readLine());
            if(queue.size() >= 7){
                double n2 = queue.peek();
                if(n < n2){
                    queue.poll();
                    queue.add(n);
                }
            } else {
                queue.add(n);
            }
        }
        List<String> answerList = new ArrayList<>();
        while (queue.size() != 0) {
            answerList.add(String.format("%.3f", queue.poll()));
        }
        for (int i = answerList.size() - 1; i >= 0; i--) {
            System.out.println(answerList.get(i));
        }
        bw.flush();
        bw.close();
    }

    
}