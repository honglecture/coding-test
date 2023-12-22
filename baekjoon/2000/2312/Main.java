// https://www.acmicpc.net/problem/2312
// 수 복원하기
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
        
        for (int i = 0; i < size; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int n = Integer.parseInt(bf.readLine());
            int start = 2;
            while (true) {
                if(n == 1){
                    break;
                }
                if(n % start == 0){
                    if(map.get(start) != null){
                        map.put(start, map.get(start) + 1);
                    } else {
                        map.put(start, 1);
                    }
                    n /= start;
                } else {
                    start++;
                }
            }
            List<Integer> keyList = new ArrayList<>(map.keySet());
            Collections.sort(keyList);
            for (int j = 0; j < keyList.size(); j++) {
                bw.write(keyList.get(j) + " " + map.get(keyList.get(j)) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}