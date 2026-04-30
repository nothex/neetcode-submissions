# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        gains={}
        stack=[(root,False)]
        res=float("-inf")
        while stack:
            node,visited=stack.pop()
            if not node:
                continue
            
            if visited:
                left_gains=max(0,gains.get(node.left,0))
                right_gains=max(0,gains.get(node.right,0))

                res=max(res,left_gains+right_gains+node.val)

                gains[node]=max(left_gains,right_gains)+node.val
            else:
                stack.append((node,True))
                stack.append((node.left,False))
                stack.append((node.right,False))
        return res