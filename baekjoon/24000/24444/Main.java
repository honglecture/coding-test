// https://www.acmicpc.net/problem/24444
// 알고리즘 수업 - 너비 우선 탐색 1
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
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
        int start = Integer.parseInt(sArray[2]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        int[] answerArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        for (int key : pathMap.keySet()) {
            Collections.sort(pathMap.get(key));
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int order = 1;
        queue.add(start);
        while (queue.size() != 0) {
            int num = queue.poll();
            if(answerArray[num] != 0){
                continue;
            }
            answerArray[num] = order++;
            List<Integer> nextList = pathMap.get(num);
            for (int i = 0; i < nextList.size(); i++) {
                queue.add(nextList.get(i));
            }
        }
        for (int i = 1; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
