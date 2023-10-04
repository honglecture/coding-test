// https://www.acmicpc.net/problem/7662
// 이중 우선순위 큐
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            Queue<Integer> maxQueue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (int) o2 - (int) o1;
                }
            });
            Queue<Integer> minQueue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (int) o1 - (int) o2;
                }
            });
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                String type = sArray[0];
                int n = Integer.parseInt(sArray[1]);
                if(type.equals("I")){
                    maxQueue.add(n);
                    minQueue.add(n);
                    if(map.get(n) == null){
                        map.put(n, 1);
                    } else {
                        map.put(n, map.get(n) + 1);
                    }
                } else {
                    if(n == 1){
                        if(!maxQueue.isEmpty()){
                            int removeN = maxQueue.poll();
                            minQueue.remove(removeN);
                        }
                    } else {
                        if(!minQueue.isEmpty()){
                            int removeN = minQueue.poll();
                            maxQueue.remove(removeN);
                        }
                    }
                }
            }
            if(maxQueue.isEmpty()){
                bw.write("EMPTY\n");
            } else {
                bw.write(maxQueue.peek() + " " + minQueue.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}