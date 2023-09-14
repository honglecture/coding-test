// https://www.acmicpc.net/problem/18352
// 특정 거리의 도시 찾기
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int city = Integer.parseInt(sArray[0]);
        int road = Integer.parseInt(sArray[1]);
        int goalCount = Integer.parseInt(sArray[2]);
        int startCity = Integer.parseInt(sArray[3]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        boolean[] visitArray = new boolean[city + 1];
        for (int i = 1; i <= city; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < road; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startCity, 0});
        List<Integer> answerList = new ArrayList<>();
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(visitArray[n]){
                continue;
            }
            visitArray[n] = true;
            if(count == goalCount){
                answerList.add(n);
                continue;
            }
            List<Integer> nextList = pathMap.get(n);
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(new int[]{nextN, count + 1});
            }
        }
        Collections.sort(answerList);
        if(answerList.size() == 0){
            answerList.add(-1);
        }
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
