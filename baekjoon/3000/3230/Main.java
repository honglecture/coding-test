// https://www.acmicpc.net/problem/3230
// 금메달, 은메달, 동메달은 누가?
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
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n1; i++) {
            map.put(i, null);
        }
        for (int i = 0; i < n1; i++) {
            int n = Integer.parseInt(bf.readLine());
            int key = i + 1;
            for (int k : map.keySet()) {
                if(map.get(k) != null){
                    if(map.get(k) >= n){
                        map.put(k, map.get(k) + 1);
                    }
                }
            }
            map.put(key, n);
        }
        List<Integer> orderList = new ArrayList<>();
        for (int i = n2; i >= 1; i--) {
            for (int key : map.keySet()) {
                if(map.get(key) == i){
                    orderList.add(key);
                    break;
                }
            }
        }
        map.clear();
        for (int i = 0; i < orderList.size(); i++) {
            map.put(orderList.get(i), null);
        }
        for (int i = 0; i < n2; i++) {
            int n = Integer.parseInt(bf.readLine());
            int key = orderList.get(i);
            for (int k : map.keySet()) {
                if(map.get(k) != null){
                    if(map.get(k) >= n){
                        map.put(k, map.get(k) + 1);
                    }
                }
            }
            map.put(key, n);
        }
        for (int i = 1; i <= 3; i++) {
            for (int key : map.keySet()) {
                if(i == map.get(key)){
                    bw.write(key + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}