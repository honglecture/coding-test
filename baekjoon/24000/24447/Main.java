// https://www.acmicpc.net/problem/24447
// 알고리즘 수업 - 너비 우선 탐색 4
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    private static Map<Integer, List<Integer>> map;
    private static int[] viaitArray;
    private static int[] dArray;
    private static int startNum = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int r = Integer.parseInt(sArray[2]);
        long answer = 0;
        map = new HashMap<>();
        viaitArray = new int[n + 1];
        dArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
            dArray[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        for (int key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        getAnswer(r);
        for (int i = 1; i < viaitArray.length; i++) {
            long result = (long) viaitArray[i] * (long) dArray[i];
            answer += result;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int rootNum){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{rootNum, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int currentD = pollArray[1];
            if(dArray[currentNum] != -1){
                continue;
            }
            viaitArray[currentNum] = startNum++;
            dArray[currentNum] = currentD;
            List<Integer> nextList = map.get(currentNum);
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new int[]{nextNum, currentD + 1});
            }
        }
    }

}
