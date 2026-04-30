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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<inorder.length;i++)
       map.put(inorder[i],i);
       TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
       return root; 
    }
    public TreeNode buildTree(int []preorder,int preS,int preE,int []inorder,int inS,int inE,Map<Integer,Integer> map){
    
    if(preS>preE || inS>inE) return null;
    TreeNode root=new TreeNode(preorder[preS]);
    int inR=map.get(root.val);
    int numLeft=inR-inS;

    root.left=buildTree(preorder,preS+1,preS+numLeft+1,inorder,inS,inR-1,map);
    root.right=buildTree(preorder,preS+numLeft+1,preE,inorder,inR+1,inE,map);
    return root;
    }
}
