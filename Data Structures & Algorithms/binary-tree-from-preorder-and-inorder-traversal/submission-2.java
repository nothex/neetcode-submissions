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
    Map <Integer , Integer > map =new HashMap <> ();
    for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
    }
    TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    return root;
    }
    public TreeNode buildTree(int[] preorder,int preSt,int preEn,int []inorder,int inSt,int inEn,Map<Integer,Integer> map){
        if(preSt>preEn || inSt >inEn) return null;
        TreeNode root=new TreeNode(preorder[preSt]);
        
        int inR=map.get(root.val);
        int numLeft=inR-inSt;
        
        root.left=buildTree(preorder,preSt+1,preSt+numLeft,inorder,inSt,inR-1,map);
        root.right=buildTree(preorder,preSt+numLeft+1,preEn,inorder,inR+1,inEn,map);
        
        return root;
    }
}