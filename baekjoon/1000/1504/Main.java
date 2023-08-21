// https://www.acmicpc.net/problem/1504
// 특정한 최단 경로
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

    private static Map<Integer, List<Integer>> pathMap;
    private static Map<String, Integer> costMap;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
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
        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MAX_VALUE;
        if(u == 1 && v == n){
            result1 = getAnswer(1, n);
        } else if(u == 1){
            int sum1 = getAnswer(1, v);
            int sum2 = getAnswer(v, n);
            if(sum1 == -1 || sum2 == -1){
                result1 = -1;
            } else {
                result1 = sum1 + sum2;
            }
        } else if(v == n){
            int sum1 = getAnswer(1, u);
            int sum2 = getAnswer(u, n);
            if(sum1 == -1 || sum2 == -1){
                result1 = -1;
            } else {
                result1 = sum1 + sum2;
            }
        } else {
            int sum1 = getAnswer(1, u);
            int sum2 = getAnswer(u, v);
            int sum3 = getAnswer(v, n);
            if(sum1 == -1 || sum2 == -1 || sum3 == -1){
                result1 = -1;
            } else {
                result1 = sum1 + sum2 + sum3;
            }
            sum1 = getAnswer(1, v);
            sum2 = getAnswer(v, u);
            sum3 = getAnswer(u, n);
            if(sum1 == -1 || sum2 == -1 || sum3 == -1){
                result1 = -1;
            } else {
                result2 = sum1 + sum2 + sum3;
            }
        }
        if(result1 == -1 || result2 == -1){
            bw.write("-1\n");
        } else {
            bw.write(Integer.min(result1, result2) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start, int end){
        int result = -1;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        boolean[] visitArray = new boolean[n + 1];
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int currentCost = pollArray[1];
            if(visitArray[currentN]){
                continue;
            }
            if(currentN == end){
                result = currentCost;
                break;
            }
            visitArray[currentN] = true;
            List<Integer> nextList = pathMap.get(currentN);
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(new int[]{nextN, currentCost + costMap.get(currentN + " " + nextN)});
            }
        }
        return result;
    }
    
}