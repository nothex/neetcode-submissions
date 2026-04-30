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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "# ";
        return root.val+" "+serialize(root.left)+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>(Arrays.asList(data.trim().split(" ")));
        TreeNode res=buildTree(q);
        return res;
    }
    public TreeNode buildTree(Queue<String> q){
        String val = q.poll();
        if(val.equals("#")) return null;
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=buildTree(q);
        node.right=buildTree(q);
        return node;
    }
}
