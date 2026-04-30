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
    int result=0;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result<=1;
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        result = Math.max(Math.abs(lh-rh),result);
        return Math.max(lh,rh)+1;
    }
}
