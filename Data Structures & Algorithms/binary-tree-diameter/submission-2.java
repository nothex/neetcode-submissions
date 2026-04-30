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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxdepth(root);
        return res;
    }
    public int maxdepth(TreeNode root){
        if(root==null) return 0;
        else{
            int leftmax=maxdepth(root.left);
            int rightmax=maxdepth(root.right);
            res=Math.max(res,leftmax+rightmax);
            return Math.max(leftmax,rightmax)+1;
        }
    }
}
