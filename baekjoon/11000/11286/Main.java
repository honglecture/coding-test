// https://www.acmicpc.net/problem/11286
// 절댓값 힙
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
                int n1 = o1;
                int n2 = o2;
                if(Math.abs(n1) == Math.abs(n2)){
                    return n1 - n2;
                } else {
                    return  Math.abs(n1) - Math.abs(n2);
                }
            }
        });

        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                if(queue.isEmpty()){
                    bw.write("0\n");
                } else{
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