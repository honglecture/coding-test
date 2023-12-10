// https://www.acmicpc.net/problem/1240
// 노드사이의 거리
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        int size = Integer.parseInt(sArray[1]);
        pathMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        costMap = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
            costMap.put(n1 + " " + n2, n3);
            costMap.put(n2 + " " + n1, n3);
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = getAnswer(n1, n2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start, int end){
        int result = 0;
        boolean[] visitArray = new boolean[n + 1];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{start, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int num = pollArray[0];
            int cost = pollArray[1];
            if(num == end){
                result = cost;
                break;
            }
            if(visitArray[num]){
                continue;
            }
            visitArray[num] = true;
            List<Integer> nextList = pathMap.get(num);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new int[]{nextNum, cost + costMap.get(num + " " + nextNum)});
            }
        }
        return result;
    }
    
}
