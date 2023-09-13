// https://www.acmicpc.net/problem/1325
// 효율적인 해킹
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        int maxCount = 0;
        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean[] visitArray = new boolean[n + 1];
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            int count = 0;
            while(queue.size() != 0){
                int currentN = queue.poll();
                if(visitArray[currentN]){
                    continue;
                }
                visitArray[currentN] = true;
                count++;
                List<Integer> nextList = pathMap.get(currentN);
                for (int j = 0; j < nextList.size(); j++) {
                    int nextN = nextList.get(j);
                    if(visitArray[nextN]){
                        continue;
                    }
                    queue.add(nextN);
                }
            }
            System.out.println(count);
            if(count > maxCount){
                answerList.clear();
                answerList.add(i);
                maxCount = count;
            } else if(count == maxCount){
                answerList.add(i);
            }
        }
        System.out.println(answerList);
        bw.flush();
        bw.close();
    }


}