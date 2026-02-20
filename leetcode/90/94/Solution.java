import java.util.ArrayList;
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

    private List<Integer> answer = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        getAnswer(root);
        return answer;
    }

    private void getAnswer(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        int val = node.val;
        if(left != null){
            getAnswer(left);
        }
        answer.add(val);
        if(right != null){
            getAnswer(right);
        }
    }

    
}