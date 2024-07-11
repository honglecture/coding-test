// https://www.acmicpc.net/problem/10175
// Dominant Species
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
            String[] sArray = bf.readLine().split(" ");
            String locate = sArray[0];
            String str = sArray[1];
            Map<String, Integer> map = new HashMap<>();
            map.put("B", 0);
            map.put("C", 0);
            map.put("M", 0);
            map.put("W", 0);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'B'){
                    map.put("B", map.get("B") + 2);
                } else if(c == 'C'){
                    map.put("C", map.get("C") + 1);
                } else if(c == 'M'){
                    map.put("M", map.get("M") + 4);
                } else if(c == 'W'){
                    map.put("W", map.get("W") + 3);
                }
            }
            String result = "";
            int maxCount = 0;
            List<String> list = new ArrayList<>();
            for (String key : map.keySet()) {
                if(maxCount < map.get(key)){
                    list.clear();
                    maxCount = map.get(key);
                    result = key;
                    list.add(key);
                } else if(maxCount == map.get(key)){
                    list.add(key);
                }
            }
            if(list.size() == 1){
                if(result.equals("B")){
                    result = "Bobcat";
                } else if(result.equals("C")){
                    result = "Coyote";
                } else if(result.equals("M")){
                    result = "Mountain Lion";
                } else if(result.equals("W")){
                    result = "Wolf";
                }
                bw.write(locate + ": The "+result+" is the dominant species\n");
            } else {
                bw.write(locate + ": There is no dominant species\n");
            }
        }
        bw.flush();
        bw.close();
    }
}


