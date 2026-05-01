# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        if not root:
            return 0
        counter=0
        stack=[(root,-101)]
        while stack:
            node,a=stack.pop()
            if node.val>=a:
                counter+=1
                a=node.val
            if node.left:
                stack.append((node.left,a))
            if node.right:
                stack.append((node.right,a))
        return counter

