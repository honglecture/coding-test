// https://www.acmicpc.net/problem/5972
// 택배 배송
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        Map<String, Integer> costMap = new HashMap<>();
        for (int i = 1; i <= n1; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n2; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]);
            int end = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            pathMap.get(start).add(end);
            pathMap.get(end).add(start);
            costMap.put(start+ " " + end, cost);
            costMap.put(end + " " + start, cost);
        }

        int[] visitArray = new int[n1 + 1];
        for (int i = 0; i < visitArray.length; i++) {
            visitArray[i] = Integer.MAX_VALUE;
        }


        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        queue.add(new int[]{1, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int currentCost = pollArray[1];
            if(visitArray[currentNum] <= currentCost){
                continue;
            }
            visitArray[currentNum] = currentCost;
            List<Integer> nextList = pathMap.get(currentNum);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new int[]{nextNum, currentCost + costMap.get(currentNum + " " + nextNum)});
            }
        }
        
        System.out.println(visitArray[n1]);
        bw.flush();
        bw.close();
    }
}