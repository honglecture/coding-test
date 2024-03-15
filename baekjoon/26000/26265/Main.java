// https://www.acmicpc.net/problem/26265
// 멘토와 멘티
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
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            if(map.get(s1) == null){
                List<String> list = new ArrayList<>();
                list.add(s2);
                map.put(s1, list);
            } else {
                map.get(s1).add(s2);
            }
        }
        for (String key : map.keySet()) {
            Collections.sort(map.get(key), Collections.reverseOrder());
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (int i = 0; i < keyList.size(); i++) {
            List<String> list = map.get(keyList.get(i));
            for (int j = 0; j < list.size(); j++) {
                bw.write(keyList.get(i) + " " + list.get(j) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
