// https://www.acmicpc.net/problem/15238
// Pirates
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            if(map.get(s) != null){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String key : map.keySet()) {
            if(map.get(key) > count){
                count = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer + " " + count);
        bw.flush();
        bw.close();
    }

    
}
