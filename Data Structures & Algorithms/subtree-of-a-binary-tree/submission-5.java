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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String t=serialise(root);
        String p=serialise(subRoot);
        int i=1,j=0;
        int lps[]=new int[p.length()];
        while(i<p.length()){
            if(p.charAt(j) == p.charAt(i)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else if(j == 0) i++;
            else j=lps[j-1];
        }
        i=0;j=0;
        while(i<t.length()){
            if(t.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j == 0) i++;
                else j=lps[j-1];
            }
            if(j == p.length()) return true;
        }
        return false;
    }
    public String serialise(TreeNode node){
        if(node == null) return "# ";
        return node.val + " " + serialise(node.left) + serialise(node.right);
    }
}
