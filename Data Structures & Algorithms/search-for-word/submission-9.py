class TrieNode:
    def __init__(self):
        self.children={}
        self.ends=False
class Prefix_Tree:
    def __init__(self):
        self.root=TrieNode()
    def add(self,word):
        node=self.root
        for c in word:
            if c not in node.children:
                node.children[c]=TrieNode()
            node=node.children[c]
        node.ends=True
class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        tri=Prefix_Tree()
        tri.add(word)
        node=tri.root
        curr=[]
        res=[]
        def dfs(i,j,node):
            if i>=0 and i<len(board) and j>=0 and j<len(board[0]) and board[i][j]!="#":
                c=board[i][j]
                if c not in node.children:
                    return False
                curr.append(c)
                node=node.children[c]
                if node.ends:
                    res.append("".join(curr))
                    node.ends=False
                board[i][j]="#"
                dfs(i-1,j,node)
                dfs(i+1,j,node)
                dfs(i,j-1,node)
                dfs(i,j+1,node)
                board[i][j]=c
                curr.pop()
                if len(res)==0:
                    return False
                else:
                    return True
            return False
        for r in range(len(board)):
            for c in range(len(board[0])):
                if dfs(r,c,node):
                    return True
        return False