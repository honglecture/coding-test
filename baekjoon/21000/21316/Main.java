// https://www.acmicpc.net/problem/21316
// 스피카
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
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> startList = new ArrayList<>();
        int[] answerArray = {1, 3, 3, 5};
        int answer = 0;
        Map<Integer, List<Integer>> answerMap = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            answerMap.put(i, new ArrayList<>());
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < 12; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        for (int key : map.keySet()) {
            if(map.get(key).size() == 1){
                startList.add(key);
            }
        }
        for (int i = 0; i < startList.size(); i++) {
            int start = startList.get(i);
            Queue<int[]> queue = new ArrayDeque<>();
            int[] visitArray = new int[13];
            for (int j = 0; j < visitArray.length; j++) {
                visitArray[j] = -1;
            }
            queue.add(new int[]{start, 0});
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int n = pollArray[0];
                int count = pollArray[1];
                if(visitArray[n] != -1){
                    continue;
                }
                visitArray[n] = count;
                List<Integer> nextList = map.get(n);
                for (int j = 0; j < nextList.size(); j++) {
                    queue.add(new int[]{nextList.get(j), count + 1});
                }
            }
            for (int j = 1; j < visitArray.length; j++) {
                answerMap.get(j).add(visitArray[j]);
            }
        }
        for (int key : answerMap.keySet()) {
            Collections.sort(answerMap.get(key));
        }
        for (int key : answerMap.keySet()) {
            List<Integer> list = answerMap.get(key);
            boolean flag = true;
            for (int i = 0; i < answerArray.length; i++) {
                if(answerArray[i] != list.get(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer = key;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
