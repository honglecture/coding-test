import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        answer = set.size();
        int index = 0;
        int[] array = new int[set.size()];
         for (int n : set) {
            array[index++] = n;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            nums[i] = array[i];
        }
        return answer;
    }
}