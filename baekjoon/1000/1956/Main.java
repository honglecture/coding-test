// https://www.acmicpc.net/problem/1956
// 운동
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
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
        costMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            pathMap.get(n1).add(n2);
            if(costMap.get(n1 + " " + n2) != null){
                costMap.put(n1 + " " + n2, Integer.min(costMap.get(n1 + " "  + n2), cost));
            } else {
                costMap.put(n1 + " " + n2, cost);
            }
        }

        bw.flush();
        bw.close();
    }


    private static int getAnswer(int start, int end){
        int result = 0;
        boolean[] visitArray = new boolean[n + 1];
        /* 
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                
            }
        });
        */
        return result;
    }

}