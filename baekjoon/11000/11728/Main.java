// https://www.acmicpc.net/problem/11728
// 2×n 타일링 2
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
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = o1;
                int n2 = o2;
                return n1 - n2;
            }
        });
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            queue.add(Integer.parseInt(sArray[i]));
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            queue.add(Integer.parseInt(sArray[i]));
        }
        while(queue.size() != 0){
            bw.write(queue.poll() + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close(); 
    }
}