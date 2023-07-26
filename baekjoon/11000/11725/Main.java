// https://www.acmicpc.net/problem/11724
// 트리의 부모 찾기
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
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < size - 1; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            List<Integer> list = new ArrayList<>();
            if(map.get(n1) != null){
                list = map.get(n1);
            }
            list.add(n2);
            map.put(n1, list);
            list = new ArrayList<>();
            if(map.get(n2) != null){
                list = map.get(n2);
            }
            list.add(n1);
            map.put(n2, list);

        }

        int[] array = new int[size + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while(queue.size() != 0){
            int n = queue.poll();
            List<Integer> list = map.get(n);
            for (int i = 0; i < list.size(); i++) {
                int child = list.get(i);
                if(array[child] != 0){
                    continue;
                }
                array[child] = n;
                queue.add(child);
            }
        }
        for (int i = 2; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}