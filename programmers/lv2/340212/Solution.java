// https://school.programmers.co.kr/learn/courses/30/lessons/340212
// [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지

class Solution {

    public static void main(String[] args) {
        int[] diffs = {1, 5, 3};
        int[] times = {2, 4, 7};
        long limit = 30;
        int result = solution(null, null, 0);
    }

    public static int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int key = 1;
        while (true) {
            long currentTime = 0;
            boolean flag = true;
            for (int i = 0; i < diffs.length; i++) {
                int diff = diffs[i];
                int time = times[i];
                if(diff <= key){
                    currentTime += time;
                } else {
                    int beforeTime = times[i - 1];
                    int n = diff - key;
                    long sum = (beforeTime + time) * n + time;
                    currentTime += sum;
                }
                if(currentTime > limit){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer = key;
                break;
            }
            key++;
        }
        return answer;
    }
}