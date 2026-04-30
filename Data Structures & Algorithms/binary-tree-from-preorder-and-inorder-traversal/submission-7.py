# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        inh={elem:ind for ind,elem in enumerate(inorder)}
        self.index=0
        def tree(s,e):
            if s>e or self.index>=len(preorder):
                return None
            root=TreeNode(preorder[self.index])
            mid=inh[preorder[self.index]]
            self.index+=1
            root.left=tree(s,mid-1)
            root.right=tree(mid+1,e)
            return root
        return tree(0,len(preorder)-1)