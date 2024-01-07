// https://www.acmicpc.net/problem/14469
// 소가 길을 건너간 이유 3
import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int answer = 0;
        int currentTime = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
    });
        for (int i = 0; i < array.length; i++) {
            queue.add(new int[]{array[i][0], array[i][1]});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n1 = pollArray[0];
            int n2 = pollArray[1];
            if(currentTime < n1){
                currentTime = n1;
            }
            currentTime += n2;
        }
        System.out.println(currentTime);
        bw.flush();
        bw.close();
    }
}