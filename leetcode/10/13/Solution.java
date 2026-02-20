import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int answer = 0;
        // ('I', 'V', 'X', 'L', 'C', 'D', 'M').
        // I X C 
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("I", 1);
        map1.put("V", 5);
        map1.put("X", 10);
        map1.put("L", 50);
        map1.put("C", 100);
        map1.put("D", 500);
        map1.put("M", 1000);
        map2.put("IV", 4);
        map2.put("IX", 9);
        map2.put("XL", 40);
        map2.put("XC", 90);
        map2.put("CD", 400);
        map2.put("CM", 900);
        for (String key : map2.keySet()) {
            int n = map2.get(key);
            if(s.contains(key)){
                answer += n;
                s = s.replaceAll(key, " ");
            }
        }
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if(key.equals(" ")){
                continue;
            }
            answer += map1.get(key);
        }
        return answer;
    }
}