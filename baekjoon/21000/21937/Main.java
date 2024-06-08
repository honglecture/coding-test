// https://www.acmicpc.net/problem/21937
// 작업
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
        boolean[] visitArray = new boolean[n + 1];
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n2).add(n1);
        }
        int keyNum = Integer.parseInt(bf.readLine());
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{keyNum, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int count = pollArray[1];
            if(visitArray[currentN]){
                continue;
            }
            visitArray[currentN] = true;
            List<Integer> nextList = pathMap.get(currentN);
            if(nextList.size() == 0){
                answer = count;
                break;
            }
            for (int i = 0; i < nextList.size(); i++) {
                queue.add(new int[]{nextList.get(i), count + 1});
            }
        }
        System.out.println(pathMap);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
