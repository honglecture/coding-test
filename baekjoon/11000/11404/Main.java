// https://www.acmicpc.net/problem/11404
// 플로이드
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class Main {

    private static int[][] array;
    private static Map<Integer, Set<Integer>> pathMap;
    private static Map<String, Integer> costMap;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            Set<Integer> list = new HashSet<>();
            if(pathMap.get(n1) != null){
                list = pathMap.get(n1);
            }
            list.add(n2);
            pathMap.put(n1, list);
            if(costMap.get(n1 + " " + n2) != null){
                costMap.put(n1 + " " + n2, Integer.min(costMap.get(n1 + " " + n2), cost));
            } else {
                costMap.put(n1 + " " + n2, cost);
            }
        }
        for (int i = 1; i <= array.length; i++) {
            getAnswer(i);
        }
        for (int i = 0; i < array.length; i++) {
            String result = "";
            for (int j = 0; j < array.length; j++) {
                result += array[i][j] + " ";
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int start){
        int[] visitArray = new int[array.length + 1];
        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> set = pathMap.get(start);
        if(set == null){
            return;
        }
        for (int n : set) {
            queue.add(new int[]{n, costMap.get(start + " " + n)});
        }
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int current = pollArray[0];
            int currentCost = pollArray[1];
            if(current == start){
                continue;
            }
            if(visitArray[current] != 0 && visitArray[current] < currentCost){
                continue;
            }
            visitArray[current] = currentCost;
            Set<Integer> nextSet = pathMap.get(current);
            if(nextSet == null){
                continue;
            }
            for (int n : nextSet) {
                queue.add(new int[]{n, costMap.get(current + " " + n) + currentCost});
            }
        }
        for (int i = 1; i < visitArray.length; i++) {
            array[start - 1][i - 1] = visitArray[i];
        }
    }
   
}