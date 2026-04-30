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
        tokens=data.split(",")
        if tokens[0]=="#":
            return
        root=TreeNode(int(tokens[0]))
        stack=[(root,"right"),(root,"left")]
        # 1,2,#,#,3,4,#,#,5,#,#
        i=1
        while i<len(tokens):
            parent,side=stack.pop()
            val=tokens[i]
            i+=1

            if val=="#":
                continue
            child=TreeNode(int(val))
            if side=="left":
                parent.left=child
            else:
                parent.right=child
            stack.append((child,"right"))
            stack.append((child,"left"))
        return root


