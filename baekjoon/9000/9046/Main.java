// https://www.acmicpc.net/problem/9046
// 복호화
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
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            Map<String, Integer> map = new HashMap<>();
            List<String> list = new ArrayList<>();
            int max = 0;
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(s.equals(" ")){
                    continue;
                }
                if(map.get(s) == null){
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }
            for (String key : map.keySet()) {
                int n = map.get(key);
                if(n > max){
                    max = n;
                    list.clear();
                    list.add(key);
                } else if(n == max){
                    list.add(key);
                }
            }
            if(list.size() == 1){
                bw.write(list.get(0) + "\n");
            } else {
                bw.write("?\n");
            }
        }
        bw.flush();
        bw.close();
    }
}