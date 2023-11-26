// https://www.acmicpc.net/problem/14938
// 큰 수 (BIG)
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

    private static Map<Integer, List<Integer>> pathMap;
    private static Map<String, Integer> costMap;
    private static int[] itemArray;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int r = Integer.parseInt(sArray[2]);
        sArray = bf.readLine().split(" ");
        itemArray = new int[sArray.length + 1];
        for (int i = 1; i < itemArray.length; i++) {
            itemArray[i] = Integer.parseInt(sArray[i - 1]);
        }
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
        for (int i = 1; i < itemArray.length; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < r; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
            if(costMap.get(n1 + " " + n2) != null){
                costMap.put(n1 + " " + n2, Integer.min(cost, costMap.get(n1 + " " + n2)));
                costMap.put(n2 + " " + n1, Integer.min(cost, costMap.get(n1 + " " + n2)));
            } else {
                costMap.put(n1 + " " + n2, cost);
                costMap.put(n2 + " " + n1, cost);
            }
            
        }
        for (int i = 1; i < itemArray.length; i++) {
            int result = getAnswer(i, m);
            if(answer < result){
                answer = result;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
    private static int getAnswer(int start, int m){
        int result = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        boolean[] visitArray = new boolean[itemArray.length];
        queue.add(new int[]{start, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int currentCost = pollArray[1];
            if(visitArray[n]){
                continue;
            }
            if(currentCost > m){
                continue;
            }
            visitArray[n] = true;
            result += itemArray[n];

            List<Integer> nextList = pathMap.get(n);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new int[]{nextNum, currentCost + costMap.get(n + " " + nextNum)});
            }
        }
        return result;
    }


}