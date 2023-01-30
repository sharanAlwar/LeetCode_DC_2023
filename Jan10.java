//100
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
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        helper(p,al1);
        helper(q,al2);
        return (al1.equals(al2))? true : false;
    }
	public static void helper(TreeNode root , ArrayList al) {
		if(root!=null) {
		al.add(root.val);
		helper(root.left,al);
		helper(root.right,al);
        }
        al.add(null);
    }
}
