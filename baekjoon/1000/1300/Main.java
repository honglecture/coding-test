// https://www.acmicpc.net/problem/1300
// K번째 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int answer = 0;
        int index = 1;
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) o1 - (int) o2;
            }
        });
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                queue.add((i + 1) * (j + 1));
            }
        }
        while(queue.size() != 0){
            bw.write(queue.poll() + " ");
        }
        bw.flush();
        bw.close();
    }
}