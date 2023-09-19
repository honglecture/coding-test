// https://www.acmicpc.net/problem/10451
// 순열 사이클
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            boolean[] visitArray = new boolean[sArray.length + 1];
            int answer = 0;
            for (int j = 0; j < sArray.length; j++) {
                map.put(j + 1, Integer.parseInt(sArray[j]));
                if(j + 1 == Integer.parseInt(sArray[j])){
                    answer++;
                    visitArray[j + 1] = true;
                }
            }
            for (int j = 1; j < visitArray.length; j++) {
                if(visitArray[j]){
                    continue;
                }
                Queue<Integer> queue = new ArrayDeque<>();
                queue.add(j);
                while(queue.size() != 0){
                    int n = queue.poll();
                    if(visitArray[n]){
                        answer++;
                        break;
                    }
                    visitArray[n] = true;
                    queue.add(map.get(n));
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}