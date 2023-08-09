// https://www.acmicpc.net/problem/1916
// 최소비용 구하기
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

    private static long[] cityArray;
    private static boolean[] visitArray;
    private static Map<Integer, List<Integer>> pathMap;
    private static Map<String, Integer> costMap;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int citySize = Integer.parseInt(bf.readLine());
        cityArray = new long[citySize + 1];
        for (int i = 0; i < cityArray.length; i++) {
            cityArray[i] = Integer.MAX_VALUE;
        }
        visitArray = new boolean[citySize + 1];
        int busSize = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        costMap = new HashMap<>();
        for (int i = 0; i < busSize; i++) {
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
            if(costMap.get(n1 + " " + n2) != null){
                costMap.put(n1 + " " + n2, Integer.min(cost, costMap.get(n1 + " " + n2)));
            } else {
                costMap.put(n1 + " " + n2, cost);
            }
        }
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        long result = getAnswer(start, end);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    private static long getAnswer(int start, int end){
        Queue<long[]> queue = new PriorityQueue<>(new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return (int)o1[1] - (int)o2[1];                
            }
        });
        if(start == end){
            return costMap.get(start + " " + end);
        }
        List<Integer> list = pathMap.get(start);
        cityArray[start] = 0;
        for (int i = 0; i < list.size(); i++) {
            int nextNum = list.get(i);
            queue.add(new long[]{nextNum, cityArray[start] + costMap.get(start + " " + nextNum)});
        }
        while(queue.size() != 0){
            long[] pollArray = queue.poll();
            long currentNum = pollArray[0];
            long currentCost = pollArray[1];
            if(cityArray[(int)currentNum] <= currentCost){
                continue;
            }
            cityArray[(int)currentNum] = currentCost;
            List<Integer> nextList = pathMap.get((int)currentNum);
            if(currentNum == end){
                break;
            }
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                queue.add(new long[]{nextNum, costMap.get(currentNum + " " + nextNum) + cityArray[(int)currentNum]});
            }
        }
        for (int i = 0; i < cityArray.length; i++) {
            System.out.print(cityArray[i] + " ");
        }
        System.out.println();
        return cityArray[end];
    }
}