// https://www.acmicpc.net/problem/2075
// N번째 큰 수
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
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int)o2-(int)o1;
            }
        });
        int size = Integer.parseInt(bf.readLine());
        int n = 1;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                queue.add(Integer.parseInt(sArray[j]));
            }
        }

        while(true){
            int num = queue.poll();
            if(size == n){
                System.out.println(num);
                break;
            }
            n++;
        }
        bw.flush();
        bw.close();
    }
}