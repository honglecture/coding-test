// https://www.acmicpc.net/problem/1389
// 케빈 베이컨의 6단계 법칙
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
    private static int n;
    private static int answer = 0;
    private static int answerCount = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
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
        for (int i = 1; i <= n; i++) {
            getAnswer(i);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    private static void getAnswer(int start){
        int[] countArray = new int[n + 1];
        boolean[] visitArray = new boolean[n + 1];
        int sum = 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int count = pollArray[1];
            if(visitArray[currentNum]){
                continue;
            }
            visitArray[currentNum] = true;
            countArray[currentNum] = count;
            List<Integer> list = pathMap.get(currentNum);
            if(list == null){
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                int nextNum = list.get(i);
                if(visitArray[nextNum]){
                    continue;
                }
                queue.add(new int[]{nextNum, count + 1});
            }
        }
        for (int i = 0; i < countArray.length; i++) {
            sum += countArray[i];
        }
        if(answerCount > sum){
            answerCount = sum;
            answer = start;
        } else if(answerCount == sum){
            if(answer > start){
                answer = start;
            }
        }
    }
}