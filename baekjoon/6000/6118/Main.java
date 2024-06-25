// https://www.acmicpc.net/problem/6118
// 숨바꼭질
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[] visitArray = new int[n + 1];
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
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
        Queue<int[]> queue = new ArrayDeque<>();
        List<Integer> startList = pathMap.get(1);
        for (int i = 0; i < startList.size(); i++) {
            queue.add(new int[]{startList.get(i), 1});
        }
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int count = pollArray[1];
            if(currentNum == 1){
                continue;
            }
            if(visitArray[currentNum] != 0){
                continue;
            }
            visitArray[currentNum] = count;
            List<Integer> nextList = pathMap.get(currentNum);
            if(nextList == null){
                continue;
            }
            for (int i = 0; i < nextList.size(); i++) {
                queue.add(new int[]{nextList.get(i), count + 1});
            }
        }
        int maxNum = 0;
        int answer1 = Integer.MAX_VALUE;
        int answer2 = 0;
        int answer3 = 0;
        for (int i = 1; i < visitArray.length; i++) {
            maxNum = Integer.max(maxNum, visitArray[i]);
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i < visitArray.length; i++) {
            if(maxNum == visitArray[i]){
                answerList.add(i);
            }
        }
        for (int i = 0; i < answerList.size(); i++) {
            answer1 = Integer.min(answer1, answerList.get(i));
        }
        answer2 = maxNum;
        answer3 = answerList.size();
        bw.write(answer1 + " " + answer2 + " " + answer3 + "\n");
        bw.flush();
        bw.close();
    }
    
}