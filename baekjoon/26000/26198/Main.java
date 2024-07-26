// https://www.acmicpc.net/problem/26198
// Chronogram
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
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                String key = String.valueOf(str.charAt(j));
                if(map.get(key) != null){
                    sum += map.get(key);
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

}
