# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        m=float('-inf')
        self.count=0
        def dfs(root,m):
            if not root:
                return
            if root.val>=m:
                m=root.val
                self.count+=1
            dfs(root.left,m)
            dfs(root.right,m)
        dfs(root,m)
        return self.count