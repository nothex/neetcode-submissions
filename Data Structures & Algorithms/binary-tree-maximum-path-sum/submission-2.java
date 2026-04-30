/**Integer.MINIMUM;
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
    public int maxPathSum(TreeNode root) {
        int [] maxValue=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPathSum(root,maxValue);
        return maxValue[0];
}
    public int maxPathSum(TreeNode root,int maxValue[]){
        if(root==null) return 0;

        int left_sum=Math.max(0,maxPathSum(root.left,maxValue));
        int right_sum=Math.max(0,maxPathSum(root.right,maxValue));

        maxValue[0]=Math.max(maxValue[0],root.val+left_sum+right_sum);

        return root.val+Math.max(left_sum,right_sum);
    }
}