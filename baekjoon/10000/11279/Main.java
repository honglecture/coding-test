// https://www.acmicpc.net/problem/11279
// 최대 힙
import java.io.*;
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
                return (int) o2 - (int) o1;
            }
        });
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
               if(queue.isEmpty()){
                  bw.write("0\n");
               } else {
                  bw.write(queue.poll() + "\n");
               }
            } else {
               queue.add(n);
            }
        }
        bw.flush();
        bw.close();
    }
}