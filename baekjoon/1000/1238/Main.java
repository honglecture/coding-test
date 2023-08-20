// https://www.acmicpc.net/problem/1238
// 파티
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
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[2]);
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
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
            costMap.put(n1 + " " + n2, cost);
        }
        for (int i = 1; i <= n; i++) {
            if(i == x){
                continue;
            }
            int result1 = getAnswer(i, x);
            int result2 = getAnswer(x, i);
            if(result1 + result2 > answer){
                answer = result1 + result2;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start, int end){
        int result = Integer.MAX_VALUE;
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
                if(result > currentCost){
                    result = currentCost;
                }
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
