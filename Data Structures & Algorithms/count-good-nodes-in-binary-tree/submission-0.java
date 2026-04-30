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
    int res=1;
    public int goodNodes(TreeNode root) {
        good(root.left,root.val);
        good(root.right,root.val);
        return res;
    }
    public void good(TreeNode root,int va){
       if(root==null)
       return ;
       if(root.val>=va)
       {
        res++;
        va=root.val;
       }
       good(root.left,Math.max(va,root.val));
       good(root.right,Math.max(va,root.val));
    }
}
