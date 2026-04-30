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
    public boolean isValidBST(TreeNode root) {
    int l=Integer.MIN_VALUE;
    int r=Integer.MAX_VALUE;
    return check(root,l,r);
    }
    public boolean check(TreeNode root,int l,int r){
        if(root == null) return true;
        if(root.val <=l || root.val >=r ) return false;
        return check(root.left,l,root.val)&&check(root.right,root.val,r);
    }
}
