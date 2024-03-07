// https://www.acmicpc.net/problem/24481
// 알고리즘 수업 - 깊이 우선 탐색 3
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<Integer, List<Integer>> pathMap;
    private static int[] answerArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int start = Integer.parseInt(sArray[2]);
        answerArray = new int[n + 1];
        pathMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            pathMap.put(i, new ArrayList<>());
            answerArray[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        for (int key : pathMap.keySet()) {
            Collections.sort(pathMap.get(key));
        }
        getAnswer(start, 0);
        for (int index = 1; index < answerArray.length; index++) {
            bw.write(answerArray[index] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int start, int d){
        if(answerArray[start] != -1){
            return;
        }
        answerArray[start] = d;
        List<Integer> list = pathMap.get(start);
        for (int i = 0; i < list.size(); i++) {
            getAnswer(list.get(i), d + 1);
        }

    }

}
