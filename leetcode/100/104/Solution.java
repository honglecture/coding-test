import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxNum = 0;
    public int maxDepth(TreeNode root) {
        int answer = 0;
        getAnswer(root, 1);
        answer = maxNum - 1;
        return answer;
    }

    private void getAnswer(TreeNode node, int count){
        if(node == null){
            maxNum = Integer.max(maxNum, count);
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        getAnswer(left, count + 1);
        getAnswer(right, count + 1);
    }
}