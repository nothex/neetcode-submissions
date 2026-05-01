# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        res=[]
        q=collections.deque([root])
        while q:
            size=len(q)
            p=[]
            for _ in range(size):
                node=q.popleft()
                if not node:
                    continue
                p.append(node.val)
                q.append(node.right)
                q.append(node.left)
            if p:
                res.append(p[0])
        return res
