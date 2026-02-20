class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(target <= n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}