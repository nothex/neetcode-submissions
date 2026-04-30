# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Codec:
    
    # Encodes a tree to a single string.
    def serialize(self, root: Optional[TreeNode]) -> str:
        s=[]
        stack=[root]
        while stack:
            node=stack.pop()
            if not node:
                s.append("#")
                continue
            s.append(str(node.val))
            stack.append(node.right)
            stack.append(node.left)
        return ",".join(s)
    # Decodes your encoded data to tree.
    def deserialize(self, data: str) -> Optional[TreeNode]:
        tokens=iter(data.split(","))
        def dfs(tokens):
            val=next(tokens)
            if val=="#":
                return
            root=TreeNode(int(val))
            root.left=dfs(tokens)
            root.right=dfs(tokens)
            return root
        return dfs(tokens)
