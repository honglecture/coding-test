// https://www.acmicpc.net/problem/24391
// 귀찮은 해강이
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int[] array = new int[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        int index = 1;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        for (int i = 1; i < array.length; i++) {
            if(array[i] != 0){
                continue;
            }
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            while (queue.size() != 0) {
                int currentNum = queue.poll();
                if(array[currentNum] != 0){
                    continue;
                }
                array[currentNum] = index;
                List<Integer> nextList = map.get(currentNum);
                for (int j = 0; j < nextList.size(); j++) {
                    int nextNum = nextList.get(j);
                    queue.add(nextNum);
                }
            }
            index++;
        }
        sArray = bf.readLine().split(" ");
        for (int i = 1; i < sArray.length; i++) {
            int n1 = Integer.parseInt(sArray[i - 1]);
            int n2 = Integer.parseInt(sArray[i]);
            if(array[n1] != array[n2]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
