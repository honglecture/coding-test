class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int n1 = nums[i];
                int n2 = nums[j];
                if(n1 + n2 == target){
                    answer[0] = i;
                    answer[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return answer;
    }
}