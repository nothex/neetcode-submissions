# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        stack=[]
        index=0
        root=TreeNode(preorder[0])
        stack.append(root)
        for val in preorder[1:]:
            node=TreeNode(val)
            if stack[-1].val!=inorder[index]:
                stack[-1].left=node
            else:
                while stack and stack[-1].val==inorder[index]:
                    last=stack.pop()
                    index+=1
                last.right=node
            stack.append(node)
        return root