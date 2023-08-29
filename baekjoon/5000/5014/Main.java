// https://www.acmicpc.net/problem/5014
// 스타트링크
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int f = Integer.parseInt(sArray[0]);
        int s = Integer.parseInt(sArray[1]);
        int g = Integer.parseInt(sArray[2]);
        int u = Integer.parseInt(sArray[3]);
        int d = Integer.parseInt(sArray[4]);
        Queue<int[]> queue = new ArrayDeque<>();
        int[] array = new int[f + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        queue.add(new int[]{s, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int cost = pollArray[1];
            System.out.println(cost);
            if(n > f){
                continue;
            }
            if(n < 1){
                continue;
            }
            if(array[n] != -1 && array[n] <= cost){
                continue;
            }
            if(n == g){
                array[n] = cost;
                break;
            }
            array[n] = cost;
            int nextNum1 = n + u;
            int nextNum2 = n - d;
            queue.add(new int[]{nextNum1, cost + 1});
            queue.add(new int[]{nextNum2, cost + 1});
        }
        if(array[g] == -1){
            bw.write("use the stairs\n");
        } else {
            bw.write(array[g] + "\n");
        }
        bw.flush();
        bw.close();
    }
}