// https://school.programmers.co.kr/learn/courses/30/lessons/258712
// 코딩테스트 연습 2024 KAKAO WINTER INTERNSHIP 가장 많이 받은 선물
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
        int result = solution(friends, gifts);
        System.out.println(result);
    }

    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> giftScoreMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], 0);
            giftScoreMap.put(friends[i], 0);
        }
        for (int i = 0; i < gifts.length; i++) {
            String[] sArray = gifts[i].split(" ");
            String name1 = sArray[0];
            String name2 = sArray[1];
            System.out.println(name1 + " " + name2);
            giftScoreMap.put(name1, giftScoreMap.get(name1) + 1);
            giftScoreMap.put(name2, giftScoreMap.get(name2) - 1);
        }
        for (int i = 0; i < friends.length - 1; i++) {
            String name1 = friends[i];
            for (int j = i + 1; j < friends.length; j++) {
                String name2 = friends[j];
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < gifts.length; k++) {
                    if(gifts[k].equals(name1 + " " + name2)){
                        count1++;
                    } else if(gifts[k].equals(name2 + " " + name1)){
                        count2++;
                    }
                }
                if(count1 > count2){
                    map.put(name1, map.get(name1) + 1);
                } else if(count2 > count1){
                    map.put(name2, map.get(name2) + 1);
                } else {
                    int giftScore1 = giftScoreMap.get(name1);
                    int giftScore2 = giftScoreMap.get(name2);
                    if(giftScore1 > giftScore2){
                        map.put(name1, map.get(name1) + 1);
                    } else if(giftScore1 < giftScore2){
                        map.put(name2, map.get(name2) + 1);
                    }
                }
            }
        }
        int maxNum = 0;
        for (String name : map.keySet()) {
            int v = map.get(name);
            if(maxNum < v){
                maxNum = v;
            }
        }
        return maxNum;
    }
}