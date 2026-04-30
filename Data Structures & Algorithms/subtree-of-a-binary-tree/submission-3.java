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
        String target = serialize(root);
        String pattern= serialize(subRoot);
        int []lps=new int[pattern.length()];
        int prev=0,i=1,j=0;
        while(i<pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(prev)){
                lps[i]=prev+1;
                prev++;
                i++;
            }
            else if(prev == 0) i++;
            else prev=lps[prev-1];
        }
        i=0;
        while(i<target.length()){
            if(target.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else {
                 if(j==0) i++;
                 else j=lps[j-1];
            }
            if(j == pattern.length()) return true; 
        }
        return false;

    }
    public String serialize(TreeNode node){
        if(node == null) return "# ";
        return node.val + " " + serialize(node.left) + serialize(node.right);
    }
}
