# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        l=float('-inf')
        r=float('inf')
        return BST(l,r,root)
def BST(l,r,root) -> bool:
    if root==None:
        return True
    if root.val<=l or root.val>=r:
        return False
    return BST(l,root.val,root.left) and BST(root.val,r,root.right)