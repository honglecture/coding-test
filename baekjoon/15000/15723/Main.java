// https://www.acmicpc.net/problem/15723
// n단 논법
import java.io.*;
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
        int size = Integer.parseInt(bf.readLine());
        Map<String, List<String>> pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String s1 = String.valueOf(str.charAt(0));
            String s2 = String.valueOf(str.charAt(str.length() - 1));
            if(pathMap.get(s1) == null){
                pathMap.put(s1, new ArrayList<>());
            }
            pathMap.get(s1).add(s2);
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String s1 = String.valueOf(str.charAt(0));
            String s2 = String.valueOf(str.charAt(str.length() - 1));
            boolean flag = false;
            Queue<String> queue = new ArrayDeque<>();
            Set<String> visitSet = new HashSet<>();
            queue.add(s1);
            while (queue.size() != 0) {
                String s = queue.poll();
                if(visitSet.contains(s)){
                    continue;
                }
                if(s.equals(s2)){
                    flag = true;
                    break;
                }
                visitSet.add(s);
                List<String> nextList = pathMap.get(s);
                if(nextList == null){
                    continue;
                }
                for (int j = 0; j < nextList.size(); j++) {
                    queue.add(nextList.get(j));
                }
            }
            if(flag){
                bw.write("T\n");
            } else {
                bw.write("F\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}