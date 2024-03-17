// https://www.acmicpc.net/problem/9612
// Maximum Word Frequency
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(map.get(str) != null){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int maxCount = 0;
        String answer = "";
        for (String key : map.keySet()) {
            if(maxCount < map.get(key)){
                answer = key;
                maxCount = map.get(key);
            }
        }
        System.out.println(answer +  " " + maxCount);
        bw.flush();
        bw.close();
    }
   

}