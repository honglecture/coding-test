// https://school.programmers.co.kr/learn/courses/30/lessons/250121
// 코딩테스트 연습 > PCCE 기출문제 > [PCCE 기출문제] 10번 / 데이터 분석

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = null;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            int[] array = data[i];
            if(ext.equals("code")){
                if(array[0] < val_ext){
                    list.add(array);
                }
            } else if(ext.equals("date")){
                if(array[1] < val_ext){
                    list.add(array);
                }
            } else if(ext.equals("maximum")){
                if(array[2] < val_ext){
                    list.add(array);
                }
            } else if(ext.equals("remain")){
                if(array[3] < val_ext){
                    list.add(array);
                }
            }
        }
        answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if(sort_by.equals("code")){
            Arrays.sort(answer, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
	            }
             });
        } else if(sort_by.equals("date")){
            Arrays.sort(answer, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
	            }
             });
        } else if(sort_by.equals("maximum")){
            Arrays.sort(answer, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[2] - o2[2];
	            }
             });
        } else if(sort_by.equals("remain")){
            Arrays.sort(answer, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[3] - o2[3];
	            }
             });
        }

        return answer;
    }
}