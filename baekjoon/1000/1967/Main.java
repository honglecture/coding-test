// https://www.acmicpc.net/problem/1967
// 트리의 지름
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

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
        if(size == 2){
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            bw.write(cost + "\n");
            bw.flush();
            bw.close();
            return;
        } else if(size == 1){
            bw.write(0 + "\n");
            bw.flush();
            bw.close();
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            String[] sArray = bf.readLine().split(" ");
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
        int start = getIndex(1);
        int n1 = getIndex(start);
        int n2 = getIndex(n1);
        int result = getAnswer(n1, n2);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    private static int getIndex(int start){
        int result = 0;
        int resultNum = 0;
        boolean[] visitArray = new boolean[size + 1];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int currentCost = pollArray[1];
            if(visitArray[currentN]){
                continue;
            }
            if(resultNum < currentCost){
                resultNum = currentCost;
                result = currentN;
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

    private static int getAnswer(int start, int end){
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visitArray = new boolean[size + 1];
        int result = 0;
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int currentCost = pollArray[1];
            if(currentN == end){
                result = currentCost;
                break;
            }
            if(visitArray[currentN]){
                continue;
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