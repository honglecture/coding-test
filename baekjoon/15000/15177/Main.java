// https://www.acmicpc.net/problem/15177
// Kiwis vs Kangaroos
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine().toUpperCase();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String key1 = "KANGAROO";
        String key2 = "KIWIBIRD";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < key1.length(); i++) {
            String s1 = String.valueOf(key1.charAt(i));
            String s2 = String.valueOf(key2.charAt(i));
            if(map1.get(s1) == null){
                map1.put(s1, 1);
            } else {
                map1.put(s1, map1.get(s1) + 1);
            }
            if(map2.get(s2) == null){
                map2.put(s2, 1);
            } else {
                map2.put(s2, map2.get(s2) + 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(map1.get(s) != null){
                count1 += map1.get(s);
            }
            if(map2.get(s) != null){
                count2 += map2.get(s);
            }
        }
        if(count1 > count2){
            System.out.println("Kangaroos");
        } else if(count1 < count2){
            System.out.println("Kiwis");
        } else {
            System.out.println("Feud continues");
        }
        bw.flush();
        bw.close();
    }

    
}
