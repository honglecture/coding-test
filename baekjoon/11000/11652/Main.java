// https://www.acmicpc.net/problem/11652
// 카드
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            long n = Long.parseLong(bf.readLine());
            if(map.get(n) == null){
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        int maxCount = 0;
        long maxNum = 0;
        for (Long key : map.keySet()) {
            int count = map.get(key);
            if(count > maxCount){
                maxNum = key;
                maxCount = count;
            } else if(count == maxCount){
                maxNum = Long.min(key, maxNum);
            }
        }
        bw.write(maxNum + "\n");
        bw.flush();
        bw.close();
    }
}