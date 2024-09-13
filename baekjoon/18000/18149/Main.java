// https://www.acmicpc.net/problem/18149
// Length of Bundle Rope
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
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int answer = 0;
            Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer temp1, Integer temp2) {
                    int n1 = temp1;
                    int n2 = temp2;
                    return n1 - n2;
                }
            });
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                queue.add(Integer.parseInt(sArray[j]));
            }
            while (true) {
                if(queue.size() == 1){
                    break;
                }
                int n1 = queue.poll();
                int n2 = queue.poll();
                answer += n1 + n2;
                queue.add(n1 + n2);
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

}
