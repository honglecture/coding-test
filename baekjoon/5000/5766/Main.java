// https://www.acmicpc.net/problem/5766
// 할아버지는 유명해!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            if(x == 0){
                break;
            }
            int[][] array = new int[y][x];
            for (int i = 0; i < array.length; i++) {
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = Integer.parseInt(sArray[j]);
                }
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int n = array[i][j];
                    if(map.get(n) == null){
                        map.put(n, 1);
                    } else {
                        map.put(n, map.get(n) + 1);
                    }
                }
            }
            int maxKey = 0;
            int maxNum = 0;
            for (int key : map.keySet()) {
                if(map.get(key) > maxNum){
                    maxNum = map.get(key);
                    maxKey = key;
                }
            }
            map.remove(maxKey);
            List<Integer> list = new ArrayList<>();
            maxNum = 0;
            for (int key : map.keySet()) {
                if(map.get(key) > maxNum){
                    maxNum = map.get(key);
                    list.clear();
                    list.add(key);
                } else if(map.get(key) == maxNum) {
                    list.add(key);
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}