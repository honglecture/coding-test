// https://www.acmicpc.net/problem/1753
// 최단경로

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Map<String, Integer> costMap = new HashMap<>();
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        int startIndex = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            List<Integer> list = new ArrayList<>();
            if(pathMap.get(n1) != null){
                list = pathMap.get(n1);
            }
            list.add(n2);
            pathMap.put(n1, list);
            if(costMap.get(n1 + " " + n2) != null){
                costMap.put(n1 + " " + n2, Integer.min(costMap.get(n1 + " " + n2), cost));
            } else {
                costMap.put(n1 + " " + n2, cost);
            }
        }
        int[] answerArray = getAnswer(startIndex, pathMap, costMap, n);
        for (int i = 1; i < answerArray.length; i++) {
            if(i == startIndex){
                bw.write(0 + "\n");
            } else {
                if(answerArray[i] == 0){
                    bw.write("INF" + "\n");
                } else {
                    bw.write(answerArray[i] + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    private static int[] getAnswer(int startIndex, Map<Integer, List<Integer>> pathMap, Map<String, Integer> costMap, int size){
        int[] visitNum = new int[size + 1];
        boolean[] visit = new boolean[size + 1];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        List<Integer> startList = pathMap.get(startIndex);
        for (int i = 0; i < startList.size(); i++) {
            queue.add(new int[]{startList.get(i), costMap.get(startIndex + " " + startList.get(i))});
        }
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentIndex = pollArray[0];
            int currentCost = pollArray[1];
            if(visit[currentIndex]){
                if(visitNum[currentIndex] <= currentCost){
                    continue;
                }
            }
            visitNum[currentIndex] = currentCost;
            visit[currentIndex] = true;
            List<Integer> list = pathMap.get(currentIndex);
            if(list == null){
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                int nextIndex = list.get(i);
                int nextCost = currentCost + costMap.get(currentIndex + " " + nextIndex);
                queue.add(new int[]{nextIndex, nextCost});
            }   
        }
        return visitNum;
    }
}

