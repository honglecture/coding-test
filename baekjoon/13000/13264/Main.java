// https://www.acmicpc.net/problem/13264
// 접미사 배열 2
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
        StringBuilder sb = new StringBuilder(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        while (true) {
            if(sb.length() == 0){
                break;
            }
            String key = sb.toString();
            map.put(key, count++);
            sb.deleteCharAt(0);
        }
        System.out.println(map);
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(map.get(list.get(i)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}