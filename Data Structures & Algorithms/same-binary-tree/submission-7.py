# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        st1=[p]
        st2=[q]
        res=False
        while st1 and st2:
            n1=st1.pop()
            n2=st2.pop()
            if n1==None and n2==None:
                continue
            if n1==None or n2==None:
                return False
            if n1.val!=n2.val:
                return False
            st1.append(n1.left)
            st2.append(n2.left) 
            st1.append(n1.right)
            st2.append(n2.right) 
        if not st1 and not st2:
            return True
        else:
            return False
            