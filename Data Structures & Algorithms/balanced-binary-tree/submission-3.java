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
    int max=0;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return max<=1;
    }
    public int height(TreeNode node){
        if(node == null) return 0;
        int lh=height(node.left);
        int rh=height(node.right);

        max=Math.max(max,Math.abs(lh-rh));
        return Math.max(lh,rh)+1;
    }
}
