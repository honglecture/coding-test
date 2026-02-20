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
    public boolean isSymmetric(TreeNode root) {
        boolean answer = true;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        getLeft(root.left, list1);
        getRight(root.right, list2);
        if(list1.size() != list2.size()){
            answer = false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if(!list1.get(i).equals(list2.get(i))){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    private void getLeft(TreeNode node, List<String> list){
        if(node == null){
            list.add("");
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        int val = node.val;
        list.add(val + "");
        getLeft(left, list);
        getLeft(right, list);
    }
    private void getRight(TreeNode node, List<String> list){
        if(node == null){
            list.add("");
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        int val = node.val;
        list.add(val + "");
        getRight(right, list);
        getRight(left, list);
    }
}