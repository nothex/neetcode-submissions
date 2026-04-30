# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        stack=[root]
        res=None
        while stack:
            curr=stack.pop()
            if not curr:
                break
            if p.val<curr.val and q.val<curr.val:
                stack.append(curr.left)
            elif p.val>curr.val and q.val>curr.val:
                stack.append(curr.right)
            else:
                res=curr
                break
        return res