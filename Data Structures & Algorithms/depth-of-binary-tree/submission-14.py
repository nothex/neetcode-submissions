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

        q=collections.deque([root])
        d=0
        while q:
            size=len(q)
            for _ in range(size):
                node=q.popleft()
                if not node:
                    break
                if node.left:    
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            d+=1
        return d
