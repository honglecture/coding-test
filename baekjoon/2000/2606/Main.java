// https://www.acmicpc.net/problem/2606
// 바이러스
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
        int size1 = Integer.parseInt(bf.readLine());
        int size2 = Integer.parseInt(bf.readLine());
        boolean[] visitArray = new boolean[size1 + 1];
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        for (int i = 0; i < size2; i++) {
            String[] sArray = bf.readLine().split(" ");
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
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while(queue.size() != 0){
            int pollNum = queue.poll();
            if(visitArray[pollNum]){
                continue;
            }
            visitArray[pollNum] = true;
            List<Integer> nextList = pathMap.get(pollNum);
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                int nextNum = nextList.get(i);
                if(visitArray[nextNum]){
                    continue;
                }
                queue.add(nextNum);
            }
        }
        int result = 0;
        for (int i = 2; i < visitArray.length; i++) {
            if(visitArray[i]){
                result++;
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}