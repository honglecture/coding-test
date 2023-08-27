// https://www.acmicpc.net/problem/1005
// ACM Craft
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            int size = Integer.parseInt(sArray[1]);
            st = new StringTokenizer(bf.readLine());
            int[] costArray = new int[n + 1];
            int[] dp = new int[n + 1];
            Map<Integer, List<Integer>> pathMap = new HashMap<>();
            Map<Integer, List<Integer>> tempathMap = new HashMap<>();
            for (int j = 0; j < n; j++) {
                costArray[j + 1] = Integer.parseInt(st.nextToken());
                pathMap.put(j + 1, new ArrayList<>());
                tempathMap.put(j + 1, new ArrayList<>());
                dp[j + 1] = -1;
            }
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                List<Integer> list = pathMap.get(n1);
                list.add(n2);
                pathMap.put(n1, list);
                list = tempathMap.get(n2);
                list.add(n1);
                tempathMap.put(n2, list);
            }
            Queue<Integer> queue = new ArrayDeque<>();
            for (int key : tempathMap.keySet()) {
                if(tempathMap.get(key).size() == 0){
                    queue.add(key);
                    dp[key] = costArray[key];
                }
            }
            int w = Integer.parseInt(bf.readLine()); // 완성 번호; 
            while(queue.size() != 0){
                int currentNum = queue.poll();
                int currentCost = dp[currentNum];
                if(currentNum == w){
                    continue;
                }
                List<Integer> nextList = pathMap.get(currentNum);
                for (int j = 0; j < nextList.size(); j++) {
                    int nextNum = nextList.get(j);
                    tempathMap.get(nextNum).remove((Object)currentNum);
                    if(currentCost + costArray[nextNum] > dp[nextNum]){
                        dp[nextNum] = currentCost + costArray[nextNum];
                    }
                    if(tempathMap.get(nextNum).size() == 0){
                        queue.add(nextNum);
                    }
                }
            }
            bw.write(dp[w] + "\n");
        }
        bw.flush();
        bw.close();
    }

}