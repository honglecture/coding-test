// https://www.acmicpc.net/problem/24482
// 알고리즘 수업 - 깊이 우선 탐색 4
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<Integer, List<Integer>> map;
    private static int[] answerArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int start = Integer.parseInt(sArray[2]);
        map = new HashMap<>();
        answerArray = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
            answerArray[i] = -1;
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
        getAnswer(start, 0);
        for (int i = 1; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
    

    private static void getAnswer(int currentNum, int order){
        if(answerArray[currentNum] != -1){
            return;
        }
        answerArray[currentNum] = order;
        List<Integer> nextList = map.get(currentNum);
        for (int i = 0; i < nextList.size(); i++) {
            int nextNum = nextList.get(i);
            getAnswer(nextNum, order + 1);
        }
    }

}
