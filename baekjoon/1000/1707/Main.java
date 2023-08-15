// https://www.acmicpc.net/problem/1707
// 이분 그래프
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
    
    private static Map<Integer, List<Integer>> pathMap;
    private static boolean[] visitArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            int pathSize = Integer.parseInt(sArray[1]);
            pathMap = new HashMap<>();
            visitArray = new boolean[n + 1];
            for (int j = 0; j < pathSize; j++) {
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
            boolean result = getAnswer();
            if(result){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static boolean getAnswer(){
        boolean result = true;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int j = 1; j < visitArray.length; j++) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            if(!visitArray[j]){
                queue.add(new int[]{j, 1});
            }
            while(queue.size() != 0){
                int[] pollArray = queue.poll();
                int num = pollArray[0];
                int type = pollArray[1];
                if(type == 1 && set2.contains(num)){
                    result = false;
                    break;
                } else if(type == 2 && set1.contains(num)) {
                    result = false;
                    break;
                }
                if(visitArray[num]){
                    continue;
                }
                if(type == 1){
                    set1.add(num);
                } else {
                    set2.add(num);
                }
                visitArray[num] = true;
                List<Integer> nextList = pathMap.get(num);
                if(nextList == null){
                    continue;
                }
                for (int i = 0; i < nextList.size(); i++) {
                    int nextNum = nextList.get(i);
                    int nextType = type == 1 ? 2 : 1;
                    queue.add(new int[]{nextNum, nextType});
                }
            }
            if(!result){
                break;
            }
        }
        return result;
    }
}
