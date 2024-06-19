// https://www.acmicpc.net/problem/5489
// Numbers
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
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(map.get(n) == null){
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int maxCount = 0;
        for (int key : map.keySet()) {
            maxCount = Integer.max(maxCount, map.get(key));
        }
        for (int key : map.keySet()) {
            if(maxCount == map.get(key)){
                list.add(key);
            }
        }
        Collections.sort(list);
        bw.write(list.get(0) + "\n");
        bw.flush();
        bw.close();
    }
}