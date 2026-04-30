# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        res=[]
        def dfs(root,dep):
            if root==None:
                return None
            if dep==len(res):
                res.append(root.val)
            dfs(root.right,dep+1)
            dfs(root.left,dep+1)
        dfs(root,0)
        return res
            
                