// https://www.acmicpc.net/problem/1516
// 게임 개발
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> costMap = new HashMap<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] dp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            map.put(i + 1, new ArrayList<>());
            dp[i + 1] = -1;
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length - 1; j++) {
                int n = Integer.parseInt(sArray[j]);
                int key = i + 1;
                if(j == 0){
                    costMap.put(key, n);
                } else {
                    map.get(key).add(n);
                }
            }
        }
        while(true){
            if(map.keySet().size() == 0){
                break;
            }
            int removeKey = 0;
            for (int key : map.keySet()) {
                List<Integer> list = map.get(key);
                if(list.size() == 0){
                    removeKey = key;
                    dp[key] = costMap.get(key);
                    break;
                } else {
                    int max = 0;
                    boolean flag = true;
                    for (int i = 0; i < list.size(); i++) {
                        int n = list.get(i);
                        if(dp[n] == -1){
                            flag = false;
                            break;
                        }
                        if(max < dp[n]){
                            max = dp[n];
                        }
                    }
                    if(flag){
                        removeKey = key;
                        dp[key] = max + costMap.get(key);
                        break;
                    }
                }
            }
            map.remove(removeKey);
        }
        for (int i = 1; i < dp.length; i++) {
            bw.write(dp[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}