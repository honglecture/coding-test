// https://www.acmicpc.net/problem/24483
// 알고리즘 수업 - 깊이 우선 탐색 5
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<Integer, List<Integer>> map;
    private static int[] visitArray;
    private static int[] dArray;
    private static int start = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int r = Integer.parseInt(sArray[2]);
        long answer = 0;
        map = new HashMap<>();
        visitArray = new int[n + 1];
        dArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
            visitArray[i] = -1;
            dArray[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }
        for (int key : map.keySet()) {
            Collections.sort(map.get(key), Collections.reverseOrder());
        }
        getAnswer(r, 0);
        for (int i = 1; i < visitArray.length; i++) {
            if(visitArray[i] == -1){
                continue;
            }
            long result = (long)visitArray[i] * (long)dArray[i];
            answer += result;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int currentNum, int d){
        if(visitArray[currentNum] != -1){
            return;
        }
        visitArray[currentNum] = start++;
        dArray[currentNum] = d;
        List<Integer> nextList = map.get(currentNum);
        for (int i = 0; i < nextList.size(); i++) {
            int nextNum = nextList.get(i);
            getAnswer(nextNum, d + 1);
        }
    }

}
