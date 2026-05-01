# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        q=collections.deque([root])
        res=[]
        
        while q:
            size=len(q)
            part=[]
            for _ in range(size):
                curr=q.popleft()
                if not curr:
                    continue
                part.append(curr.val)
                q.append(curr.left)
                q.append(curr.right)
            if part:
                res.append(part)
        return res
