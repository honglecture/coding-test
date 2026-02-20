class Solution {
    public int climbStairs(int n) {
        int answer = 0;
        int[] array = new int[46];
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        for (int i = 4; i < array.length; i++) {
            int n1 = array[i - 2];
            int n2 = array[i - 1];
            array[i] = n1 + n2;
        }
        answer = array[n];
        return answer;
    }
}