# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Codec:
    
    # Encodes a tree to a single string.
    def serialize(self, root: Optional[TreeNode]) -> str:
        if root==None:
            return "#"
        return f"${root.val}$"+self.serialize(root.left)+self.serialize(root.right)
        # Decodes your encoded data to tree.
    def deserialize(self, data: str) -> Optional[TreeNode]:
        i=j=0
        tokens=[]
        while i<len(data):
            if data[i]=="#":
                tokens.append("#")
                i+=1
            elif data[i]=="$":
                j=i+1
                while data[j]!="$":
                    j+=1
                tokens.append(int(data[i+1:j]))
                i=j+1
            else:
                i=i+1
        tokens=iter(tokens)
        def helper():
            val = next(tokens)
            if val=="#":
                return None
            root=TreeNode(val)
            root.left=helper()
            root.right=helper()
            return root
        return helper()


 