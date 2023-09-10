// https://www.acmicpc.net/problem/1302
// 베스트셀러
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        String key = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(map.get(str) == null){
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        for (String str : map.keySet()) {
            if(answer < map.get(str)){
                answer = map.get(str);
                key = str;
            } else if(answer ==  map.get(str)){
                if(str.compareTo(key) < 0){
                    key = str;
                }
            }
        }
        bw.write(key + "\n");
        bw.flush();
        bw.close();
    }
}