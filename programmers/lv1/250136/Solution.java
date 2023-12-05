// https://school.programmers.co.kr/learn/courses/30/lessons/250136
// 코딩테스트 연습 > PCCP 기출문제 > [PCCP 기출문제] 2번

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int[][] visitArray = new int[land.length][land[0].length];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int index = 1;
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if(land[i][j] == 1 && visitArray[i][j] == 0){
                    int count = 0;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(land[y][x] == 0){
                            continue;
                        }
                        if(visitArray[y][x] != 0){
                            continue;
                        }
                        count++;
                        visitArray[y][x] = index;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > land.length - 1 || nextX > land[0].length - 1){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    map.put(index, count);
                    index++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < visitArray[0].length; i++) {
            Set<Integer> set = new HashSet<>();
            int result = 0;
            for (int j = 0; j < visitArray.length; j++) {
                set.add(visitArray[j][i]);
            }
            for (int n : set) {
                result += map.get(n);
            }
            if(max < result){
                max = result;
            }
        }
        answer = max;
        return answer;
    }
}