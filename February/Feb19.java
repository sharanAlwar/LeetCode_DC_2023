//103
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if(root==null) return new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
        boolean ltr = true;
		while(!q.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<>();
            int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode ptr = q.poll();
				if(ptr.left != null)  {
                    q.offer(ptr.left);
                }
                if(ptr.right != null) {
                    q.offer(ptr.right);
                }
                if(ltr){
                    list.add(ptr.val);
                }else{
                    list.add(0,ptr.val);
                }
			}
            ltr = !ltr;
			ans.add(list);
		}
		return ans;
	}
}
