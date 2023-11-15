// https://www.acmicpc.net/problem/10282
// 해킹
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
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int count = 0;
            int totalCost = 0;
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            int d = Integer.parseInt(sArray[1]);
            int c = Integer.parseInt(sArray[2]);
            boolean[] visitArray = new boolean[n + 1];
            Map<Integer, List<Integer>> pathMap = new HashMap<>();
            Map<String, Integer> costMap = new HashMap<>();
            for (int j = 1; j <= n; j++) {
                pathMap.put(j, new ArrayList<>());
            }
            for (int j = 0; j < d; j++) {
                sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                int cost = Integer.parseInt(sArray[2]);
                pathMap.get(n2).add(n1);
                costMap.put(n2 + " " + n1, cost);
            }
            Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2){
                    return o1[1] - o2[1];
                }
            });
            queue.add(new int[]{c, 0});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int currentNum = pollArray[0];
                int currentCost = pollArray[1];
                if(visitArray[currentNum]){
                    continue;
                }
                visitArray[currentNum] = true;
                totalCost = currentCost;
                List<Integer> nextList = pathMap.get(currentNum);
                for (int j = 0; j < nextList.size(); j++) {
                    int nextNum = nextList.get(j);
                    queue.add(new int[]{nextNum, currentCost + costMap.get(currentNum + " " + nextNum)});
                }
            }
            for (int j = 0; j < visitArray.length; j++) {
                if(visitArray[j]){
                    count++;
                }
            }
            bw.write(count + " " + totalCost + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}



