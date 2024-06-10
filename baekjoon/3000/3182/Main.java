// https://www.acmicpc.net/problem/3182
// 한동이는 공부가 하기 싫어!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int maxNum = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Map<Integer, Integer> patMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            patMap.put(i + 1, array[i]);
        }
        //int[] visitArray = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{i, 0});
            boolean[] innerVisitArray = new boolean[size + 1];
            int result = 0;
            while (queue.size() != 0) {
                int[] pollArray = queue.poll();
                int n = pollArray[0];
                int count = pollArray[1];
                if(innerVisitArray[n]){
                    result = count;
                    break;
                }
                innerVisitArray[n] = true;
                queue.add(new int[]{patMap.get(n), count + 1});
            }
            if(maxNum < result){
                maxNum = result;
                answer = i;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}