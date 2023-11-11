// https://www.acmicpc.net/problem/12851
// 숨바꼭질 2
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
        boolean[] visitArray = new boolean[100001];
        int answerCount = Integer.MAX_VALUE;
        int minAnswer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{n1, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(n == n2){
                if(count < answerCount){
                    answerCount = count;
                } else if(count == answerCount){
                }
                continue;
            }
            if(visitArray[n]){
                continue;
            }
            visitArray[n] = true;
            if(n - 1 > -1){
                queue.add(new int[]{n - 1, count + 1});
            }
            if(n + 1 <= visitArray.length - 1){
                queue.add(new int[]{n + 1, count + 1});
            }
            if(n * 2 <= visitArray.length - 1){
                queue.add(new int[]{n * 2, count + 1});
            }
        }
        int[] countArray = new int[100001];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = Integer.MAX_VALUE;
        }
        queue = new ArrayDeque<>();
        queue.add(new int[]{n1, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(n == n2){
                if(count == answerCount){
                    minAnswer++;
                }
                continue;
            }
            if(countArray[n] < count){
                continue;
            }
            if(count >= answerCount){
                continue;
            }
            countArray[n] = count;
            if(n - 1 > -1){
                queue.add(new int[]{n - 1, count + 1});
            }
            if(n + 1 <= visitArray.length - 1){
                queue.add(new int[]{n + 1, count + 1});
            }
            if(n * 2 <= visitArray.length - 1){
                queue.add(new int[]{n * 2, count + 1});
            }
        }
        bw.write(answerCount + "\n");
        bw.write(minAnswer + "\n");
        bw.flush();
        bw.close();
    }

}
