// https://www.acmicpc.net/problem/16953
// A → B
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        long answer = -1;
        Queue<long[]> queue = new ArrayDeque<>();
        queue.add(new long[]{start, 1});
        while(queue.size() != 0){
            long[] pollArray = queue.poll();
            long n = pollArray[0];
            long count = pollArray[1];
            if(n == end){
                answer = count;
                break;
            }
            if(n > end){
                continue;
            }
            long nextN1 = n * 2;
            long nextN2 = Long.parseLong(String.valueOf(n) + "1");
            queue.add(new long[]{nextN1, count + 1});
            queue.add(new long[]{nextN2, count + 1});
        } 
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
