// https://www.acmicpc.net/problem/11403
// 경로 찾기
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
public class Main {
    private static int[][] array;
    private static int[][] answerArray;
    private static Map<Integer, List<Integer>> pathMap;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        answerArray = new int[size][size];
        pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    continue;
                }
                int n = array[i][j];
                if(n == 1){
                    list.add(j);
                }
            }
            pathMap.put(i, list);
        }
        for (int i = 0; i < array.length; i++) {
            getAnswer(i);
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray.length; j++) {
                bw.write(answerArray[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    private static void getAnswer(int start){
        Queue<Integer> queue = new ArrayDeque<>();
        int[] visitArray = new int[array.length];
        List<Integer> list = pathMap.get(start);
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        while(queue.size() != 0){
            int n = queue.poll();
            if(visitArray[n] == 1){
                continue;
            }
            answerArray[start][n] = 1;
            visitArray[n] = 1;
            List<Integer> nextList = pathMap.get(n);
            
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                 queue.add(nextList.get(i));
            }
        }
    }
}