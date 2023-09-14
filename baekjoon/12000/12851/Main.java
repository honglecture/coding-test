// https://www.acmicpc.net/problem/12851
// 2048 (Easy)
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{n1, 0});
        boolean[] visitArray = new boolean[200001];
        int minCount = Integer.MAX_VALUE;
        int sumCount = 0;
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(visitArray[n]){
                continue;
            }
            if(n == n2){
                if(minCount > count){
                    minCount = count;
                    sumCount = 1;
                } else if(minCount == count){
                    sumCount += 1;
                }
            }
            visitArray[n] = true;
            if(n - 1 >= 0){
                queue.add(new int[]{n - 1, count + 1});
            }
            if(n + 1 < visitArray.length){
                queue.add(new int[]{n + 1, count + 1});
            }
            if(n * 2 < visitArray.length){
                queue.add(new int[]{n * 2, count + 1});
            }
        }
        bw.write(minCount + "\n");
        bw.write(sumCount + "\n");
        bw.flush();
        bw.close();
    }

}
