// https://www.acmicpc.net/problem/23758
// 중앙값 제거
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int index = size % 2 == 0 ? size / 2 - 1 : size / 2;
        String[] sArray = bf.readLine().split(" ");
        int answer = 1;
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = o1;
                int n2 = o2;
                return n2 - n1;
            }
        });
        for (int i = 0; i <= index; i++) {
            queue.add(Integer.parseInt(sArray[i]));
        }
        while (true) {
            int n = queue.poll();
            if(n / 2 == 0){
                break;
            }
            answer++;
            queue.add(n / 2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
