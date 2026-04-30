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
    int dif=0;
    public boolean isBalanced(TreeNode root) {
    height(root);
    if(dif<=1) return true;
    else return false;
    }
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        dif=Math.max(Math.abs(lh-rh),dif);
        return Math.max(lh,rh)+1;
    }
}
