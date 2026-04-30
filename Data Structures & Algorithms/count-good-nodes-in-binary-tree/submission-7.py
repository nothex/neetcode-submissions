# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        count=0
        v=float('-inf')
        stack=[(root,v)]
        while stack:
            curr,v=stack.pop()
            if not curr:
                continue
            if curr.val>=v:
                count+=1
                v=curr.val
            stack.append((curr.left,v))
            stack.append((curr.right,v))
        return count