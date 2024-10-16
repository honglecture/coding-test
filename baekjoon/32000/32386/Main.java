// https://www.acmicpc.net/problem/32386
// KCPC에 등장할 알고리즘 맞히기
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 2; j < sArray.length; j++) {
                String key = sArray[j];
                if(map.get(key) == null){
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
        for (String key : map.keySet()) {
            int count = map.get(key);
            if(maxCount < count){
                maxCount = count;
                list.clear();
                list.add(key);
            } else if(maxCount == count){
                list.add(key);
            }
        }
        if(list.size() == 1){
            System.out.println(list.get(0));
        } else {
            System.out.println("-1");
        }
        bw.flush();
        bw.close();
    }


}
