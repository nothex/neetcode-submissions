# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        q1=collections.deque([p])
        q2=collections.deque([q])
        
        while q1 and q2:
            n1=q1.popleft()
            n2=q2.popleft()
            if n1==None and n2==None:
                continue
            if n1==None or n2==None:
                return False
            if n1.val!=n2.val:
                return False
            q1.append(n1.left)
            q2.append(n2.left) 
            q1.append(n1.right)
            q2.append(n2.right) 
        if not q1 and not q2:
            return True
        else:
            return False
            