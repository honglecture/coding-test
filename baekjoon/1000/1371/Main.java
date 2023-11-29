// https://www.acmicpc.net/problem/1371
// 가장 많은 글자
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
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                continue;
            }
            if(str == null || str.equals("")){
                break;
            }
            for (int j = 0; j < str.length(); j++) {
                String s = str.charAt(j) + "";
                if(s.equals(" ")){
                    continue;
                }
                if(map.get(s) != null){
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        int num = 0;
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            int v = map.get(key);
            if(num < v){
                num = v;
                list.clear();
                list.add(key);
            } else if(num == v){
                list.add(key);
            }
        }
        Collections.sort(list);
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }


}