// https://www.acmicpc.net/problem/24446
// 알고리즘 수업 - 너비 우선 탐색 3
import java.io.*;
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
        int start = Integer.parseInt(sArray[2]);
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<int[]> queue = new ArrayDeque<>();
        int[] answerArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
            answerArray[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        queue.add(new int[]{start, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int currentCount = pollArray[1];
            if(answerArray[currentNum] != -1){
                continue;
            }
            answerArray[currentNum] = currentCount;
            List<Integer> nextList = map.get(currentNum);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new int[]{nextNum, currentCount + 1});
            }
        }
        for (int i = 1; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
