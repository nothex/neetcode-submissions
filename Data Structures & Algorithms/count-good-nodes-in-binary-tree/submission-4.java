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
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int curr=root.val;
        dfs(root,curr);
        return res;
    }
    public void dfs(TreeNode root,int curr){
        if(root == null) return;
        if(root.val>=curr){
            res++;
            curr=root.val;
        }
        dfs(root.left,curr);
        dfs(root.right,curr);
    }
}
