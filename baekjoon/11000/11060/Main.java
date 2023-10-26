// https://www.acmicpc.net/problem/11060
// 점프 점프
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] visitArray = new int[size];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 1});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int index = pollArray[0]; // 현재 index
            int count = pollArray[1];
            if(index > array.length - 1){
                continue;
            }
            if(visitArray[index] != 0 && visitArray[index] <= count){
                continue;
            }
            visitArray[index] = count;
            int n = array[index];
            for (int i = 0; i < n; i++) {
                queue.add(new int[]{index + i + 1, count + 1});
            }
        }
        int answer = -1;
        if(visitArray[size - 1] != 0){
            answer = visitArray[size - 1] - 1;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}