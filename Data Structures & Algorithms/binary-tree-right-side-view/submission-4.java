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
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,list,0);
        return list;
    }
    public void dfs(TreeNode root,List<Integer> list,Integer dep){
        if(root == null) return;
        if(list.size() == dep) list.add(root.val);
        dfs(root.right,list,dep+1);
        dfs(root.left,list,dep+1);
    }
}
