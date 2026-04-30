# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        temp=[]
        depth=0
        res=[]
        def dfs(root,depth):
            if not root:
                return None
            if len(temp)==depth:
                temp.append([])
            temp[depth].append(root.val)
            dfs(root.left,depth+1)
            dfs(root.right,depth+1)
        dfs(root,0)
        for i in temp:
            res.append(i[-1])
        return res