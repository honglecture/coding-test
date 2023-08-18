// https://www.acmicpc.net/problem/2294
// 동전 2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int goal = Integer.parseInt(sArray[1]);
        int[] dp = new int[goal + 1];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n <= goal){
                set.add(n);
                dp[n] = 1;
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            for (int j = n; j < dp.length; j+=n) {
                if(dp[j] == 0){
                    dp[j] = j / n;
                } else {
                    dp[j] = Integer.min(j / n, dp[j]);
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            
            for (int j = 0; j <= i; j++) {
                int n1 = j;
                int n2 = i - j;
                if(n1 > n2){
                    break;
                }
                if(dp[n1] == 0 || dp[n2] == 0){
                    continue;
                }
                if(dp[i] == 0){
                    dp[i] = dp[n1] + dp[n2];
                } else {
                    dp[i] = Integer.min(dp[i], dp[n1] + dp[n2]);
                }
            }
        }
        if(dp[goal] == 0){
            bw.write("-1\n");
        } else {
            bw.write(dp[goal] + "\n");
        }
        bw.flush();
        bw.close();
    }
}