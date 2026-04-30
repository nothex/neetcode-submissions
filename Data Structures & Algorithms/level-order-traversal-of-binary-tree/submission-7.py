# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res=[]
        stack=collections.deque([root])
        while stack:
            level=[]
            size=len(stack)
            for i in range(size):
                curr=stack.popleft()
                if not curr:
                    continue
                level.append(curr.val)
                stack.append(curr.left)
                stack.append(curr.right)
            if level:
                res.append(level)
        return res