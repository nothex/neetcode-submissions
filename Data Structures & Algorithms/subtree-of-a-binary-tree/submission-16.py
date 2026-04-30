# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        def same(p,q):
            st1=[p]
            st2=[q]
            while st1 and st2:
                n1=st1.pop()
                n2=st2.pop()

                if not n1 and not n2:
                    continue
                if not n1 or not n2:
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
        sta1=[root]
        while sta1:
            n1=sta1.pop()
            if n1.val==subRoot.val and same(n1,subRoot):
                return True
            else:
                if not n1:
                    break
                if n1.left:
                    sta1.append(n1.left)
                if n1.right:
                    sta1.append(n1.right)
        return False
        
