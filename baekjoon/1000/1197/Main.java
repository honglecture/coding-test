// https://www.acmicpc.net/problem/1197
// 최소 스패닝 트리
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
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
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        Map<String, Integer> costMap = new HashMap<>();
        for (int i = 0; i < size2; i++) {
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
        int[] visitArray = new int[size1 + 1];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] < o2[1]){
                    return -1;
                } else if(o1[1] > o2[1]){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        queue.add(new int[]{1, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int currentCost = pollArray[1];
            if(currentNum != 1 && visitArray[currentNum] != 0){
                continue;
            }
            visitArray[currentNum] = currentCost;
            List<Integer> nextList = pathMap.get(currentNum);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                if(currentNum != 1 && visitArray[nextNum] != 0){
                    continue;
                }
                queue.add(new int[]{nextNum, costMap.get(currentNum + " " + nextNum)});
            }
        }
        int sum = 0;
        for (int i = 2; i < visitArray.length; i++) {
            sum += visitArray[i];
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}
