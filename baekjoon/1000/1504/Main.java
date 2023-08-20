// https://www.acmicpc.net/problem/1504
// 특정한 최단 경로
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

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        Map<String, Integer> costMap = new HashMap<>();
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
            list = new ArrayList<>();
            if(pathMap.get(n2) != null){
                list = pathMap.get(n2);
            }
            list.add(n1);
            pathMap.put(n2, list);
            costMap.put(n1 + " " + n2, cost);
            costMap.put(n2 + " " + n1, cost);
        }
        sArray = bf.readLine().split(" ");
        int u = Integer.parseInt(sArray[0]);
        int v = Integer.parseInt(sArray[1]);
        int answer = 0;
        boolean[] visitArray = new boolean[n + 1];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == u || o1[0] == v){
                    return -1;
                } else {
                    return o1[1] - o2[1];
                }
                
            }
        });
        queue.add(new int[]{1, 0, 0, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int currentCost = pollArray[1];
            int currentU = pollArray[2];
            int currentV = pollArray[3];
            int nextU = currentU;
            int nextV = currentV;
            System.out.println(currentN);
            if(visitArray[currentN]){
                continue;
            }
            if(currentN == n){
                if(currentU == 1 && currentV == 1){
                    answer = currentCost;
                    break;
                }
                continue;
            }
            if(currentN == u){
                nextU = 1;
            }
            if(currentN == v){
                nextV = 1;
            }
            visitArray[currentN] = true;
            List<Integer> nextList = pathMap.get(currentN);
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                queue.add(new int[]{nextN, currentCost + costMap.get(currentN + " " + nextN), nextU, nextV});
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}