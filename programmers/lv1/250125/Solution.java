// https://school.programmers.co.kr/learn/courses/30/lessons/250125
// 코딩테스트 연습 > PCCE 기출문제 > [PCCE 기출문제] 9번 / 이웃한 칸

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] array1 = {-1, 0 ,1, 0};
        int[] array2 = {0, 1, 0 , -1};
        String type = board[h][w];
        for (int i = 0; i < array1.length; i++) {
            int resultY = h + array1[i];
            int resultX = w + array2[i];
            if(resultX < 0 || resultY < 0 || resultY > board.length - 1 || resultX > board[0].length - 1){
                continue;
            }
            if(board[resultY][resultX].equals(type)){
                answer++;
            }
        }
        return answer;
    }
}