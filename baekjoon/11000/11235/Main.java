// https://www.acmicpc.net/problem/11235
// Polling
import java.io.*;
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
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(map.get(str) == null){
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            max = Integer.max(max, map.get(key));
        }
        for (String key : map.keySet()) {
            if(map.get(key) == max){
                list.add(key);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}