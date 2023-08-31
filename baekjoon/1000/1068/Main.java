// https://www.acmicpc.net/problem/1068
// 트리

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
public class Main {

    private static Map<Integer, List<Integer>> pathMap;
    private static boolean[] visitArray;
    private static int deleteN;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int root = 0;
        int n = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        deleteN = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        visitArray = new boolean[n];
        for (int i = 0; i < n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < sArray.length; i++) {
            int n1 = i;
            int n2 = Integer.parseInt(sArray[i]);
            if(n2 == -1){
                root = n1;
                continue;
            }
            pathMap.get(n2).add(n1);
        }
        deletePathMap(deleteN);
        int answer = getAnswer(root);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void deletePathMap(int start){
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> deleteList = new ArrayList<>();
        deleteList.add(start);
        queue.add(start);
        while(queue.size() != 0){
            int currentN = queue.poll();
            if(visitArray[currentN]){
                continue;
            }
            visitArray[currentN] = true;
            deleteList.add(currentN);
            List<Integer> list = pathMap.get(currentN);
            if(list.size() == 0){
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                int nextN = list.get(i);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(nextN);
            }
        }
        for (int n : deleteList) {
            for (int key : pathMap.keySet()) {
                pathMap.get(key).remove((Object) n);
            }
        }
        pathMap.remove(start);
    }

    private static int getAnswer(int start){
        int result = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        while(queue.size() != 0){
            int currentN = queue.poll();
            if(visitArray[currentN]){
                continue;
            }
            visitArray[currentN] = true;
            List<Integer> list = pathMap.get(currentN);
            if(list.size() == 0){
                result++;
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                int nextN = list.get(i);
                if(visitArray[nextN]){
                    if(nextN == deleteN){
                        result++;
                    }
                    continue;
                }
                queue.add(nextN);
            }
        }
        return result;
    }
    
}
