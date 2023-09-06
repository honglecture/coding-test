// https://www.acmicpc.net/problem/1976
// 여행 가자
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "YES";
        int n = Integer.parseInt(bf.readLine());
        int tourSize = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 1; i <= n; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 1; j <= sArray.length; j++) {
                int num = Integer.parseInt(sArray[j - 1]);
                if(i == j || num == 0){
                    continue;
                }
                pathMap.get(i).add(j);
            }
        }
        int[] tourArray = new int[tourSize];
        String[] sArray = bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            tourArray[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < tourArray.length; i++) {
            set.add(tourArray[i]);
        }
        int currentNum = set.iterator().next();
        set.remove(currentNum);
        if(set.size() == 0){
            System.out.println(answer);
            return;
        }
        while(true){
            boolean flag = false;
            boolean[] visitaArray = new boolean[n + 1];
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(currentNum);
            int result = 0;
            while(queue.size() != 0){
                int num = queue.poll();
                if(set.contains(num)){
                    flag = true;
                    result = num;
                    break;
                }
                if(visitaArray[num]){
                    continue;
                }
                visitaArray[num] = true;
                List<Integer> nextList = pathMap.get(num);
                for (int i = 0; i < nextList.size(); i++) {
                    queue.add(nextList.get(i));
                }
            }
            if(!flag){
                answer = "NO";
                break;
            }
            set.remove(result);
            if(set.size() == 0){
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
    
}