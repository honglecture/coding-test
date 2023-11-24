// https://www.acmicpc.net/problem/24445
// 알고리즘 수업 - 너비 우선 탐색 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
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
        int m = Integer.parseInt(sArray[1]);
        int r = Integer.parseInt(sArray[2]);
        int[] visitArray = new int[n + 1];
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        for (int key : pathMap.keySet()) {
            Collections.sort(pathMap.get(key), Collections.reverseOrder());
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(r);
        int count = 1;
        while (queue.size() != 0) {
            int currentNum = queue.poll();
            if(visitArray[currentNum] != 0){
                continue;
            }
            visitArray[currentNum] = count++;
            List<Integer> nextList = pathMap.get(currentNum);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(nextNum);
            }
        }
        for (int i = 1; i < visitArray.length; i++) {
            bw.write(visitArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
