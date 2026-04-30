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
            if not root:
                temp.append("#")
                return
            temp.append(f"${root.val}$")
            dfs(root.left)
            dfs(root.right)
        dfs(root)
        return "".join(temp)
        # $1$$2$##$3$$4$##$5$##
    # Decodes your encoded data to tree.
    def deserialize(self, data: str) -> Optional[TreeNode]:
        i=j=0
        tokens=[]
        while i<len(data):
            if data[i]=="#":
                tokens.append("#")
                i+=1
            elif data[i]=="$":
                i+=1
                j=i
                while data[j]!="$":
                    j+=1
                tokens.append(data[i:j])
                i=j+1
            else:
                i+=1
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