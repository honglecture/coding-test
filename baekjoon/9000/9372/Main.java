// https://www.acmicpc.net/problem/9372
// 상근이의 여행
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

    private static Map<Integer, List<Integer>> pathMap;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            int size = Integer.parseInt(sArray[1]);
            pathMap = new HashMap<>();
            for (int j = 1; j <= n; j++) {
                pathMap.put(j, new ArrayList<>());
            }
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                pathMap.get(n1).add(n2);
                pathMap.get(n2).add(n1);
            }
            bw.write(n - 1 + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(){
        int result = 0;
        Set<String> set = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            List<Integer> nextList = pathMap.get(n);
            for (int i = 0; i < nextList.size(); i++) {
                int nextN = nextList.get(i);
                
            }
        }
        return result;
    }

}