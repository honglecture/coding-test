// https://www.acmicpc.net/problem/1946
// 신입 사원
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
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[][] array = new int[size][2];
            for (int j = 0; j < array.length; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                array[j][0] = n1;
                array[j][1] = n2;
            }
            Arrays.sort(array, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0] < o2[0]){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            int count = 1;
            Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int n1 = o1;
                    int n2 = o2;
                    if(n1 < n2){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            queue.add(array[0][1]);
            for (int j = 1; j < array.length; j++) {
                int currentN = array[j][1];
                queue.add(currentN);
                if(currentN == queue.peek()){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}