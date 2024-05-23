// https://www.acmicpc.net/problem/6188
// Clear Cold Water
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] answerArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            map.get(n1).add(n2);
            map.get(n1).add(n3);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1, 1});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int count = pollArray[1];
            answerArray[currentN] = count;
            List<Integer> nextList = map.get(currentN);
            for (int i = 0; i < nextList.size(); i++) {
                queue.add(new int[]{nextList.get(i), count + 1});
            }
        }
        for (int i = 1; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}