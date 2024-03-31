// https://www.acmicpc.net/problem/25418
// 정수 a를 k로 만들기
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{n1, 0});
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        while (true) {
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(n == n2){
                answer = count;
                break;
            }
            if(n > n2){
                continue;
            }
            if(set.contains(n)){
                continue;
            }
            set.add(n);
            queue.add(new int[]{n + 1, count + 1});
            queue.add(new int[]{n * 2, count + 1});
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
