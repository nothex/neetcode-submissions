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
    public int maxDepth(TreeNode root) {
        int maxl,maxr;int count=0;
        if(root==null) return 0;
        maxl=maxDepth(root.left);
        maxl++;
        maxr=maxDepth(root.right);
        maxr++;
        
        return Math.max(maxr,maxl); 
    }
}
