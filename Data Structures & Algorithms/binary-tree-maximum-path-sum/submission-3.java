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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    public int maxGain(TreeNode root){
        if(root == null) return 0;
        int left=Math.max(maxGain(root.left),0);
        int right=Math.max(maxGain(root.right),0);
        maxSum=Math.max(maxSum,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
