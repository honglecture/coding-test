// https://www.acmicpc.net/problem/2644
// 촌수계산
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

    private static int answer = -1;
    private static Map<Integer, Set<Integer>> pathMap;
    private static int n1;
    private static int n2;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        n1 = Integer.parseInt(sArray[0]);
        n2 = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int p = Integer.parseInt(sArray[0]);
            int c = Integer.parseInt(sArray[1]);
            Set<Integer> set = new HashSet<>();
            if(pathMap.get(p) != null){
                set = pathMap.get(p);
            }
            set.add(c);
            pathMap.put(p, set);
            set = new HashSet<>();
            if(pathMap.get(c) != null){
                set = pathMap.get(c);
            }
            set.add(p);
            pathMap.put(c, set);
        }
        for (int key : pathMap.keySet()) {
            if(key == n1 || key == n2){
                getAnswer(key);
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int key){
        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        boolean[] visitArray = new boolean[n + 1];
        set.add(n1);
        set.add(n2);
        set.remove(key);
        queue.add(new int[]{key, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int currentCount = pollArray[1];
            if(visitArray[currentNum]){
                continue;
            }
            if(set.contains(currentNum)){
                answer = currentCount;
                break;
            }
            visitArray[currentNum] = true;
            Set<Integer> nextSet = pathMap.get(currentNum);
            if(nextSet == null){
                continue;
            }
            for (int nextNum : nextSet) {
                queue.add(new int[]{nextNum, currentCount + 1});
            }
        }
    }
}