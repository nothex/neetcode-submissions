# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Codec:
    
    # Encodes a tree to a single string.
    def serialize(self, root: Optional[TreeNode]) -> str:
        temp=[]
        def dfs(root):
            if root==None:
                temp.append("#")
                return
            temp.append(f"{root.val}")
            dfs(root.left) 
            dfs(root.right)
        dfs(root)    
        return ",".join(temp) 
    # Decodes your encoded data to tree.
    # 1,2,#,#,3,4,#,#,5,#,#
    def deserialize(self, data: str) -> Optional[TreeNode]:
        tokens=data.split(",")
        tokens=iter(tokens)
        def dfs():
            val=next(tokens)
            if val=="#":
                return None
            root=TreeNode(int(val))
            root.left=dfs()
            root.right=dfs()
            return root
        return dfs()