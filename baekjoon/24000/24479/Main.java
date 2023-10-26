// https://www.acmicpc.net/problem/24479
// 알고리즘 수업 - 깊이 우선 탐색 1
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static int[] visitArray;
    private static Map<Integer, List<Integer>> pathMap;
    private static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int r = Integer.parseInt(sArray[2]);
        pathMap = new HashMap<>();
        visitArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(pathMap.get(i));
        }
        getAnswer(r);
        for (int i = 1; i < visitArray.length; i++) {
            bw.write(visitArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int n){
        if(visitArray[n] != 0){
            return;
        }
        visitArray[n] = order++;
        List<Integer> nextList = pathMap.get(n);
        for (int i = 0; i < nextList.size(); i++) {
            int nextNum = nextList.get(i);
            getAnswer(nextNum);
        }
    }

}
