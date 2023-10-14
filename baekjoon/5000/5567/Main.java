// https://www.acmicpc.net/problem/5567
// 결혼식
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
        int n = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visitArray = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int count = pollArray[1];
            if(count >= 3){
                continue;
            }
            if(visitArray[currentN]){
                continue;
            }
            visitArray[currentN] = true;
            List<Integer> list = map.get(currentN);
            for (int i = 0; i < list.size(); i++) {
                int nextN = list.get(i);
                if(visitArray[nextN]){
                    continue;
                }
                queue.add(new int[]{nextN, count + 1});
            }
        }
        int answer = 0;
        for (int i = 2; i < visitArray.length; i++) {
            if(visitArray[i]){
                answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}