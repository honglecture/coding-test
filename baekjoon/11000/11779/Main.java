// https://www.acmicpc.net/problem/11779
// 최소비용 구하기 2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        int n = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        Map<String, Integer> costMap = new HashMap<>();
        int[] dp = new int[n + 1];
        String[] strDp = new String[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            pathMap.get(n1).add(n2);
            String key = n1 + " " + n2;
            if(costMap.get(key) != null){
                costMap.put(key, Integer.min(costMap.get(key), cost));
            } else {
                costMap.put(key, cost);
            }
        }
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        Queue<Object[]> queue = new ArrayDeque<>();
        queue.add(new Object[]{start, 0, 0, ""});
        while (queue.size() != 0) {
            Object[] pollArray = queue.poll();
            int currentN = (int) pollArray[0];
            int currentCost = (int) pollArray[1];
            int count = (int) pollArray[2];
            String str = (String) pollArray[3];
            if(currentCost >= dp[currentN]){
                continue;
            }
            dp[currentN] = currentCost;
            if(count == 0){
                strDp[currentN] = currentN +"";
            } else {
                strDp[currentN] = str + " " + currentN;
            }
            List<Integer> nextList = pathMap.get(currentN);
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                queue.add(new Object[]{nextN, currentCost + costMap.get(currentN + " " + nextN), count + 1, strDp[currentN]});
            }
        }
        bw.write(dp[end] + "\n");
        bw.write(strDp[end].split(" ").length + "\n");
        bw.write(strDp[end] + "\n");
        bw.flush();
        bw.close(); 
    }

}