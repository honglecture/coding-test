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

        public boolean isSameTree(TreeNode p, TreeNode q) {
            boolean answer = true;
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            if(p != null){
                getAnswer(p, list1);
            }
            
            if(q != null){
                getAnswer(q, list2);
            }
            
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

        private void getAnswer(TreeNode node, List<String> list){
            if(node == null){
                list.add("");
                return;
            }
            TreeNode left = node.left;
            TreeNode right = node.right;
            int val = node.val;
            list.add(val + "");
            getAnswer(left, list);
            getAnswer(right, list);
        }
    }