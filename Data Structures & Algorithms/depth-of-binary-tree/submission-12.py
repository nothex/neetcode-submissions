# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        stack=collections.deque([root])
        d=0
        while stack:
            size=len(stack)
            for _ in range(size):
                curr=stack.popleft()
                if curr.left:
                    stack.append(curr.left)
                if curr.right:
                    stack.append(curr.right)
            d+=1
        return d