# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        inh={elem:i for i,elem in enumerate(inorder)}
        
        root=TreeNode(preorder[0])
        stack=[root]

        for i in preorder[1:]:
            node=TreeNode(i)
            if inh[i]<inh[stack[-1].val]:
                stack[-1].left=node
            else:
                parent=None
                while stack and inh[i]>inh[stack[-1].val]:
                    parent=stack.pop()
                parent.right=node
            stack.append(node)
        return root