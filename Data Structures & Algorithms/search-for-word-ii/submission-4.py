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
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        tri=Prefix_Tree()
        for word in words:
            tri.add(word)
        node=tri.root
        curr=[]
        res=[]
        def dfs(i,j,node):
            if i>=0 and i<len(board) and j>=0 and j<len(board[0]) and board[i][j]!="#" and board[i][j] in node.children:
                t=board[i][j]
                node=node.children[t]
                curr.append(t)
                if node.ends:
                    res.append("".join(curr))
                    node.ends=False
                board[i][j]="#"
                dfs(i+1,j,node)
                dfs(i-1,j,node)
                dfs(i,j+1,node)
                dfs(i,j-1,node)
                board[i][j]=t
                curr.pop()
            else:
                return
        for r in range(len(board)):
            for c in range(len(board[0])):
                dfs(r,c,node)
        return res