# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root==None:
            return []
        res=[]
        s=collections.deque([root])
        while s:
            size=len(s)
            l1=[]
            for i in range(size):
                curr=s.popleft()
                l1.append(curr.val)
                if curr.left!=None:
                    s.append(curr.left)
                if curr.right!=None:
                    s.append(curr.right)
            res.append(l1)
        return res


