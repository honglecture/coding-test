// https://www.acmicpc.net/problem/15323
// ZigZag
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
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            String str = bf.readLine();
            String key = String.valueOf(str.charAt(0));
            if(map.get(key) == null){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
            indexMap.put(key, 0);
        }
        for (int i = 0; i < size2; i++) {
            String key = bf.readLine();
            int index = indexMap.get(key);
            List<String> list = map.get(key);
            bw.write(list.get(index) + "\n");
            index++;
            if(index == list.size()){
                index = 0;
            }
            indexMap.put(key, index);
        }
        bw.flush();
        bw.close();
    }

    
}
