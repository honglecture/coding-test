class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int minNum = Integer.MAX_VALUE;
        for (int price : prices) {
            minNum = Integer.min(minNum, price);
            answer = Integer.max(answer, price - minNum);
        }
        return answer;
    }
}