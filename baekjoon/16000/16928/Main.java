// https://www.acmicpc.net/problem/16928
// 뱀과 사다리 게임
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map1.put(n1, n2);
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map2.put(n1, n2);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visitArray = new boolean[101];
        int answer = 0;
        queue.add(new int[]{1, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int num = pollArray[0];
            int count = pollArray[1];
            if(num > 100){
                continue;
            }
            if(num == 100){
                answer = count;
                break;
            }
            if(visitArray[num]){
                continue;
            }
            visitArray[num] = true;
            for (int i = 1; i <= 6; i++) {
                int nextNum = num + i;
                if(map1.get(nextNum) != null){
                    queue.add(new int[]{map1.get(nextNum), count + 1});
                } else if(map2.get(nextNum) != null){
                    queue.add(new int[]{map2.get(nextNum), count + 1});
                } else {
                    queue.add(new int[]{nextNum, count + 1});
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}
