// https://www.acmicpc.net/problem/14248
// 점프 점프
import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        boolean[] visitArray = new boolean[size];
        int start = Integer.parseInt(bf.readLine()) - 1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{start, 1});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(visitArray[n]){
                continue;
            }
            visitArray[n] = true;
            int nextNum1 = n - array[n];
            int nextNum2 = n + array[n];
            if(nextNum1 >= 0 && nextNum1 <= array.length - 1){
                queue.add(new int[]{nextNum1, count + 1});
            }
            if(nextNum2 >= 0 && nextNum2 <= array.length - 1){
                queue.add(new int[]{nextNum2, count + 1});
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(visitArray[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}