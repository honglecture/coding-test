// https://www.acmicpc.net/problem/1956
// 운동
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
    private static int answer = Integer.MAX_VALUE;
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
            costMap.put(n1 + " " + n2, cost);
        }
        for (int i = 1; i <= n; i++) {
            int result = getAnswer(i);
            if(result == 0){
                continue;
            }
            if(answer > result){
                answer = result;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start){
        int result = 0;
        int[] visitArray = new int[n + 1];
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        List<Integer> startList = pathMap.get(start);
        for (int i = 0; i < startList.size(); i++) {
            queue.add(new int[]{startList.get(i), costMap.get(start + " " + startList.get(i))});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int num = pollArray[0];
            int cost = pollArray[1];
            if(visitArray[num] != 0 && visitArray[num] < cost){
                continue;
            }
            if(cost > answer){
                continue;
            }
            visitArray[num] = cost;
            if(num == start){
                break;
            }
            List<Integer> list = pathMap.get(num);
            for (int i = 0; i < list.size(); i++) {
                int nextNum = list.get(i);
                queue.add(new int[]{nextNum, cost + costMap.get(num + " " + nextNum)});
            }
        }
        result = visitArray[start];
        return result;
    }
}