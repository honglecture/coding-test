// https://www.acmicpc.net/problem/1963
// 소수 경로
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {

    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 1000; i <= 9999; i++) {
            boolean flag = true;
            int n = i;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if(n % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                set.add(n);
            }
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int count = getAnswer(n1, n2);
            if(count == -1){
                bw.write("Impossible\n");
            } else {
                bw.write(count + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    private static int getAnswer(int start, int end){
        int answer = -1;
        boolean[] dp = new boolean[10000];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{start, 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int n = pollArray[0];
            int count = pollArray[1];
            if(dp[n]){
                continue;
            }
            if(!set.contains(n)){
                continue;
            }
            if(n == end){
                answer = count;
                break;
            }
            dp[n] = true;
            StringBuilder str = new StringBuilder(String.valueOf(n));
            for (int i = 49; i <= 57; i++) {
                str.setCharAt(0, (char) i);
                queue.add(new int[]{Integer.parseInt(str.toString()), count + 1});
            }
            str = new StringBuilder(String.valueOf(n));
            for (int i = 48; i <= 57; i++) {
                str.setCharAt(1, (char) i);
                queue.add(new int[]{Integer.parseInt(str.toString()), count + 1});
            }
            str = new StringBuilder(String.valueOf(n));
            for (int i = 48; i <= 57; i++) {
                str.setCharAt(2, (char) i);
                queue.add(new int[]{Integer.parseInt(str.toString()), count + 1});
            }
            str = new StringBuilder(String.valueOf(n));
            for (int i = 49; i <= 57; i+=2) {
                str.setCharAt(3, (char) i);
                queue.add(new int[]{Integer.parseInt(str.toString()), count + 1});
            }
        }
        return answer;
    }

}