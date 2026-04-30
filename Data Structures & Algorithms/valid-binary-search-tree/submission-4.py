# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        mi=float('-inf')
        ma=float('inf')
        def dfs(root,mi,ma):
            if not root:
                return True
            if root.val>mi and root.val<ma:
                return dfs(root.left,mi,root.val) and dfs(root.right,root.val,ma)
            else:
                return False
        return dfs(root,mi,ma)