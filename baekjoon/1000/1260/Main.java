// https://www.acmicpc.net/problem/1260
// DFS와 BFS

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
    private static List<Integer> dfsList = new ArrayList<>();
    private static List<Integer> bfsList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int start = Integer.parseInt(sArray[2]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] nArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(nArray[0]);
            int n2 = Integer.parseInt(nArray[1]);
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
        }

        for (int key : pathMap.keySet()) {
            Collections.sort(pathMap.get(key));
        }
        boolean[] visitArray = new boolean[n + 1];
        dfsList.add(start);
        visitArray[start] = true;
        getDfs(pathMap, start, visitArray);
        visitArray = new boolean[n + 1];
        bfsList.add(start);
        visitArray[start] = true;
        getBfs(pathMap, start, visitArray);
        String result1 = "";
        String result2 = "";
        for (int i = 0; i < dfsList.size(); i++) {
            if(i == dfsList.size() - 1){
                result1 += dfsList.get(i);
            } else {
                result1 += dfsList.get(i) + " ";
            }
        }
        for (int i = 0; i < bfsList.size(); i++) {
            if(i == bfsList.size() - 1){
                result2 += bfsList.get(i);
            } else {
                result2 += bfsList.get(i) + " ";
            }
            
        }
        bw.write(result1 + "\n");
        bw.write(result2 + "\n");
        bw.flush();
        bw.close();
    }
    private static void getDfs(Map<Integer, List<Integer>> pathMap, int start, boolean[] visitArray){
        List<Integer> list = pathMap.get(start);
        if(list == null){
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(visitArray[n]){
                continue;
            }
            dfsList.add(n);
            visitArray[n] = true;
            getDfs(pathMap, n, visitArray);
        }
    }

    private static void getBfs(Map<Integer, List<Integer>> pathMap, int start, boolean[] visitArray){
        List<Integer> list = pathMap.get(start);
        if(list == null){
            return;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        while(queue.size() != 0){
            int pollNum = queue.poll();
            if(visitArray[pollNum]){
                continue;
            }
            visitArray[pollNum] = true;
            bfsList.add(pollNum);
            List<Integer> nextList = pathMap.get(pollNum);
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                if(visitArray[nextNum]){
                    continue;
                }
                queue.add(nextNum);
            }
        }
    }

}