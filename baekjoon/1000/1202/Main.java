// https://www.acmicpc.net/problem/1202
// 보석 도둑
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        String[] sArray = bf.readLine().split(" ");
        int storeSize = Integer.parseInt(sArray[0]);
        int bagSize = Integer.parseInt(sArray[1]);
        int[][] storeArray = new int[storeSize][2];
        List<Integer> bagList = new ArrayList<>();
        for (int i = 0; i < storeSize; i++) {
            sArray = bf.readLine().split(" ");
            int m = Integer.parseInt(sArray[0]);
            int v = Integer.parseInt(sArray[1]);
            storeArray[i][0] = m;
            storeArray[i][1] = v;
            queue.add(new int[]{m, v});
        }
        for (int i = 0; i < bagSize; i++) {
            bagList.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(bagList);
        long sum = 0;
        boolean[] visitArray = new boolean[bagList.size()];
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int m = pollArray[0];
            int v = pollArray[1];
            if(bagList.size() == 0){
                break;
            }
            int removeIndex = -1;
            int start = 0;
            int end = bagList.size() - 1;
            while(true){
                int mid = (start + end) / 2;
                if(start > end){
                    break;
                }
                if(bagList.get(mid) == m){
                    if(!visitArray[mid]){
                        removeIndex = mid;
                        break;
                    }
                }
                if(bagList.get(mid) > m){
                    if(!visitArray[mid]){
                        removeIndex = mid;
                    }
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if(removeIndex == -1){
                continue;
            }
            sum += v;
            visitArray[removeIndex] = true;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}
