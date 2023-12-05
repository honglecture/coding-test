// https://school.programmers.co.kr/learn/courses/30/lessons/250137
// 코딩테스트 연습 > PCCP 기출문제 > [PCCP 기출문제] 1번

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int sec = 1;
        int currentHealth = health;
        int count = 0;
        int endSec = attacks[attacks.length - 1][0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < attacks.length; i++) {
            map.put(attacks[i][0], attacks[i][1]);
        }
        while (true) {
            if(sec == endSec + 1){
                answer = currentHealth;
                break;
            }
            if(map.get(sec) != null){
                count = 0;
                currentHealth -= map.get(sec);
            } else {
                currentHealth += bandage[1];
                count++;
                if(count == bandage[0]){
                    currentHealth += bandage[2];
                    count = 0;
                }
            }
            if(currentHealth <= 0){
                answer = -1;
                break;
            }
            if(currentHealth >= health){
                currentHealth = health;
            }
            sec++;
        }

        return answer;
    }
}