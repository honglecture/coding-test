// https://www.acmicpc.net/problem/1167
// 트리의 지름
import java.io.*;
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
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
        for (int i = 1; i <= size; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            for (int j = 1; j < sArray.length - 1; j += 2) {
                int n2 = Integer.parseInt(sArray[j]);
                int cost = Integer.parseInt(sArray[j + 1]);
                pathMap.get(n1).add(n2);
                costMap.put(n1 + " " + n2, cost);
                costMap.put(n2 + " " + n1, cost);
            }
        }
        int start = getIndex(1);
        int end = getIndex(start);
        int result = getAnswer(start, end);
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start, int end){
        int result = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];                
            }
        });
        boolean[] visitArray = new boolean[size + 1];
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int cost = pollArray[1];
            if(n == end){
                result = cost;
                break;
            }
            if(visitArray[n]){
                continue;
            }
            visitArray[n] = true;
            List<Integer> nextList = pathMap.get(n);
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                int nextCost = cost + costMap.get(n + " " + nextN);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(new int[]{nextN, nextCost});
            }
        }
        return result;
    }

    private static int getIndex(int start){
        int result = 0;
        int resultNum = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];                
            }
        });
        boolean[] visitArray = new boolean[size + 1];
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int cost = pollArray[1];
            if(visitArray[n]){
                continue;
            }
            visitArray[n] = true;
            boolean flag = false;
            List<Integer> nextList = pathMap.get(n);
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                int nextCost = cost + costMap.get(n + " " + nextN);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(new int[]{nextN, nextCost});
                flag = true;
            }
            if(!flag){
                if(cost > resultNum){
                    resultNum = cost;
                    result = n;
                }
            }
        }
        return result;
    }


}