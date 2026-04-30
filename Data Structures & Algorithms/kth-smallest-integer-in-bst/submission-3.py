# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        l=[]
        dfs(l,root)
        return l[k-1]
def dfs(l,root):
    if root==None:
        return
    dfs(l,root.left)
    l.append(root.val)
    dfs(l,root.right)