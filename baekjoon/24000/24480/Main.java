// https://www.acmicpc.net/problem/24480
// 알고리즘 수업 - 깊이 우선 탐색 2
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<Integer, List<Integer>> pathMap;
    private static int[] answerArray;
    private static int order = 1;

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
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        for (int key : pathMap.keySet()) {
            Collections.sort(pathMap.get(key), Collections.reverseOrder());
        }
        getAnswer(start);
        for (int index = 1; index < answerArray.length; index++) {
            bw.write(answerArray[index] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int start){
        if(answerArray[start] != 0){
            return;
        }
        answerArray[start] = order++;
        List<Integer> list = pathMap.get(start);
        for (int i = 0; i < list.size(); i++) {
            getAnswer(list.get(i));
        }

    }

}
