// https://www.acmicpc.net/problem/11724
// 연결 요소의 개수
import java.io.*;
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
        boolean[] visit = new boolean[n + 1];
        int count = 0;
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
        for (int i = 1; i < visit.length; i++) {
            if(visit[i]){
                continue;
            }
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            count++;
            while(queue.size() != 0){
                int pollNum = queue.poll();
                if(visit[pollNum]){
                    continue;
                }
                visit[pollNum] = true;
                List<Integer> list = pathMap.get(pollNum);
                if(list == null){
                    continue;
                }
                for (int j = 0; j < list.size(); j++) {
                    int nextNum = list.get(j);
                    if(visit[nextNum]){
                        continue;
                    }
                    queue.add(nextNum);
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}