// https://www.acmicpc.net/problem/2252
// 줄 세우기
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
        int[] countArray = new int[n + 1];
        boolean[] visitArray = new boolean[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            List<Integer> list = new ArrayList<>();
            if(map.get(n1) != null){
                list = map.get(n1);
            }
            list.add(n2);
            map.put(n1, list);
            countArray[n2]++;
        }
        List<Integer> answerList = new ArrayList<>();
        while(true){
            Queue<Integer> queue = new ArrayDeque<>();
            for (int i = 1; i < visitArray.length; i++) {
                if(countArray[i] == 0 && !visitArray[i]){
                    queue.add(i);
                }
            }
            if(queue.size() == 0){
                break;
            }
            while(queue.size() != 0){
                int currentNum = queue.poll();
                visitArray[currentNum] = true;
                List<Integer> nextList = map.get(currentNum);
                answerList.add(currentNum);
                if(nextList == null){
                    continue;
                }
                for (int i = 0; i < nextList.size(); i++) {
                    int nextNum = nextList.get(i);
                    if(visitArray[nextNum]){
                        continue;
                    }
                    if(countArray[nextNum] - 1 >= 0){
                        countArray[nextNum]--;
                    }
                }
            }
        }
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
