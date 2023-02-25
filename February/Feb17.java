//783
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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        int min= Integer.MAX_VALUE;
        helper(root,list);
        for(int i=1;i<list.size();i++){
            int temp = list.get(i)-list.get(i-1);
            if(min>temp){
                min=temp;
            }
        }
        return min;
    }

    public void helper(TreeNode root,ArrayList list){
        if(root==null){
            return ;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}
