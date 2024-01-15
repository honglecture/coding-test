// https://www.acmicpc.net/problem/2596
// 비밀편지
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        Map<String, String> map = new HashMap<>();
        String answer = "";
        map.put("000000", "A");
        map.put("001111", "B");
        map.put("010011", "C");
        map.put("011100", "D");
        map.put("100110", "E");
        map.put("101001", "F");
        map.put("110101", "G");
        map.put("111010", "H");
        for (int i = 0; i < size * 6; i += 6) {
            String key = str.substring(i, i + 6);
            if(map.get(key) != null){
                answer += map.get(key);
            } else {
                int count = 0;
                String temp = "";
                for (String s : map.keySet()) {
                    int innerCount = 0;
                    for (int j = 0; j < s.length(); j++) {
                        char c1 = s.charAt(j);
                        char c2 = key.charAt(j);
                        if(c1 != c2){
                            innerCount++;
                        }
                    }
                    if(innerCount == 1){
                        count++;
                        temp = map.get(s);
                    }
                }
                if(count == 1){
                    answer += temp;
                } else {
                    answer = (i / 6 + 1) + "";
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}