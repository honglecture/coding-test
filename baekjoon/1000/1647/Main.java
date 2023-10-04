// https://www.acmicpc.net/problem/1647
// 도시 분할 계획

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.xml.namespace.QName;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>());
        }
        Map<String, Integer> costMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
            if(costMap.get(n1 + " " + n2) == null){
                costMap.put(n1 + " " + n2, cost);
                costMap.put(n2 + " " + n1, cost);
            } else {
                int min = Integer.min(cost, costMap.get(n1 + " " + n2));
                costMap.put(n1 + " " + n2, min);
                costMap.put(n2 + " " + n1, min);
            }
        }
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        int start = 1;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        dp[start] = 0;
        while(queue.size() != 0){
            int num = queue.poll();
            Set<Integer> set = map.get(num);
            for (int nextNum : set) {
                int cost = costMap.get(num + " " + nextNum);
                if(dp[nextNum] > cost){
                    queue.add(nextNum);
                    dp[nextNum] = cost;
                }
            }
        }
        int sum = 0;
        for (int i = 1; i < dp.length; i++) {
            sum += dp[i];
        }
        for (int i = 1; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}

