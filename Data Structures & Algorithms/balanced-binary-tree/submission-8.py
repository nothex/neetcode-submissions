# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        self.dif=0
        def dep(root):
            if not root:
                return 0

            left=dep(root.left)
            right=dep(root.right)
            if left-right<0:
                self.dif=max(self.dif,right-left)
            else:
                self.dif=max(self.dif,left-right)
            return max(left,right)+1
        dep(root)
        return True if self.dif<=1 else False
            
