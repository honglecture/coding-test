// https://www.acmicpc.net/problem/13237
// Binary tree
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = new int[size + 1];
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int index = i + 1;
            map.put(index, n);
        }
        for (int i = 1; i <= size; i++) {
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{i, 0});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int n = pollArray[0];
                int count = pollArray[1];
                if(map.get(n) == -1){
                    array[i] = count;
                    break;
                }
                queue.add(new int[]{map.get(n), count + 1});
            }
        }
        for (int i = 1; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}