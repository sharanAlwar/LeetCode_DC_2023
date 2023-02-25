//226
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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    public static TreeNode helper(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right = helper(left);
        root.left = helper(right);
        return root;
    }
}
